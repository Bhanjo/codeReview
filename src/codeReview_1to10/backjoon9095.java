// 문제 리뷰 : https://blog.naver.com/hanjo1515/221907470363
package codeReview_1to10;

import java.util.Scanner;

public class backjoon9095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(); // 테스트 케이스 수

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt(); //표현법을 찾을 수 n 입력
			int[] array = new int[n + 1]; //주의!!
            
            //주의2
			if (n == 1)
				System.out.println(1);
			else if (n == 2)
				System.out.println(2);
			else if (n == 3)
				System.out.println(4);
			else {
				array[1] = 1;
				array[2] = 2;
				array[3] = 4;
				for (int j = 4; j <= n; j++) {
					array[j] = array[j - 1] + array[j - 2] + array[j - 3];
				}
				System.out.println(array[n]);
			}
		}
		sc.close();
	}
}

