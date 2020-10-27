// 문제 리뷰 : https://blog.naver.com/hanjo1515/221868712289
package codeReview_1to10;

import java.util.Scanner;

public class backjoon1978 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 수의 갯수

		int count = 0; // 소수 찾으면 카운트
		boolean tf = true; // 소수판별

		while (n-- > 0) {
			int sosu = sc.nextInt();

			if (sosu <= 1) // 해설_1
				tf = false;
			
			for (int j = 2; j < sosu; j++) { // 해설_2
				if (sosu % j == 0)
					tf = false;
			}
			
			if (tf == true)
				count++;
			tf=true; //해설_3
		}
		System.out.println(count);
		sc.close();
	}
}
