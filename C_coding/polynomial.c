#include <stdio.h>
#define MAX(a, b) (((a) > (b)) ? (a) : (b))
#define MAX_DEGREE 101

typedef struct
{
    int degree;
    float coef[MAX_DEGREE];
} polynomial;

char compare(int a, int b)
{
    if (a > b)
        return '>';
    else if (a == b)
        return '=';
    else
        return '<';
}

polynomial poly_add1(polynomial A, polynomial B)
{
    polynomial C;
    int Apos = 0, Bpos = 0, Cpos = 0;
    int degree_a = A.degree;
    int degree_b = B.degree;
    C.degree = MAX(A.degree, B.degree);
    while (Apos <= A.degree && Bpos <= B.degree)
    {
        switch (compare(degree_a, degree_b))
        {
        case '>':
            C.coef[Cpos++] = A.coef[Apos++];
            degree_a--;
            break;
        case '=':
            C.coef[Cpos++] = A.coef[Apos++] + B.coef[Bpos++];
            degree_a--;
            degree_b--;
            break;
        case '<':
            C.coef[Cpos++] = B.coef[Apos++];
            degree_b--;
            break;

        default:
            printf("에러!");
            break;
        }
    }
    return C;
}

void poly_print(polynomial C)
{
    for (int i = 0; i < 6; i++)
    {
        if (i == 5)
            printf("%2.0f", C.coef[i]);
        else
        {
            printf("%2.0fX%d +", C.coef[i], C.degree - i);
        }
    }
}

main()
{
    polynomial a = {5, {3, 6, 0, 0, 0, 10}};
    polynomial b = {4, {7, 0, 5, 0, 1}};
    polynomial c = poly_add1(a, b);
    poly_print(c);
}