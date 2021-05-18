#include <stdio.h>

typedef int element;
typedef struct DlistNode{
    element data;
    struct DlistNode *llink;
    struct DlistNode *rlink;  
} DlistNode;

// 초기화
DlistNode *init() {
    DlistNode *phead_node;
    phead_node = (DlistNode *)malloc(sizeof(DlistNode));

    // 헤드노드는 자기 자신을 가리켜야한다.
    phead_node -> llink = phead_node -> rlink = phead_node;
}

// 삽입
void dinsert_node(DlistNode *before, DlistNode *new_node){
    new_node->llink = before;
    new_node->rlink = before->rlink;
    before->rlink->llink = new_node;
    before->rlink = new_node;
}

// 삭제
void dremove_node(DlistNode *phead_node, DlistNode *removed) {
    if(removed == phead_node) return;
    removed->llink -> rlink = removed -> rlink;
    removed->rlink -> llink = removed -> llink;
    free(removed);
}

// 찾을 값 검색
DlistNode *get_node(DlistNode *phead_node, int x) {
    DlistNode *p = phead_node;
    while( p != NULL) {
        if(p->data == x)
            return p;
        p = p->rlink;
    }
    return ;
} 

// 출력
void print_node(DlistNode* phead_node) {
    DlistNode *p = phead_node;

    // 헤드노드가 가르키는 값부터 시작
    for(p = phead_node->rlink; p != phead_node; p=p->rlink){
        printf("->%d", p->data);
    }
    printf("\n");
}

// 노드 생성
DlistNode *create_node(int x){
    DlistNode *p;
    p = (DlistNode *)malloc(sizeof(DlistNode));
    p->data = x;
    p->rlink = NULL;
    p->llink = NULL;
    return p;
}

void main() {
    DlistNode*list;
    list = init();
    
    dinsert_node(list, create_node(10));
    printf("\n10을 Dlist에 삽입 \n\n"); print_node(list);
    dinsert_node(list, create_node(20));
    printf("\n20을 Dlist에 삽입 \n\n"); print_node(list);
    dinsert_node(list, create_node(30));
    printf("\n30을 Dlist에 삽입 \n\n"); print_node(list);

    dinsert_node(get_node(list, 20), create_node(40));
    printf("\n40을 Dlist에 20 다음에 삽입 \n\n"); print_node(list);

    dremove_node(list, get_node(list, 20));
    printf("\n20을 찾아 Dlist에서 삭제 \n\n");print_node(list);    
    printf("\n");
}
