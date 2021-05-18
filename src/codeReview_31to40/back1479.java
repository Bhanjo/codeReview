//백준1479번 코드
package backjoon; //재출시 지우자

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int e = sc.nextInt();
		int s = sc.nextInt();
		int m = sc.nextInt();
		int i = 0; //연도 카운트
		int Earth = 0, Sun = 0, Moon = 0; //입력받은 숫자와 일치여부 판단
		
		while (true) {
			if (e == Earth && s == Sun && m == Moon) {
				System.out.println(i);
				break;
			} else {
				Earth++;
				Sun++;
				Moon++;
			}
			if (Earth > 15)
				Earth = 1;
			if (Sun > 28)
				Sun = 1;
			if (Moon > 19)
				Moon = 1;
			i++;
		}
		sc.close();
	}
}
