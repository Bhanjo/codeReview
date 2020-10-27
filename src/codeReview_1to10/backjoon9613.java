// 문제 리뷰 : https://blog.naver.com/hanjo1515/221857959622
package codeReview_1to10;

import java.util.Scanner;

public class backjoon9613 {

	public static int gcd(int x, int y) { // GCD구하기
		if (y == 0)
			return x;
		else
			return gcd(y, x % y);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(); // 테스트 캐이스 갯수

		for (int i = 0; i < t; i++) {
			long sum = 0; // GCD의 합
			int n = sc.nextInt(); // 입력받을 숫자 갯수
			int[] test = new int[n]; // 테스트 케이스

			for (int j = 0; j < n; j++) { // 숫자 입력
				test[j] = sc.nextInt();
			}

			for (int k = 0; k < n - 1; k++) { // gcd합 구한 후 저장 (브루트포스 응용)
				for (int h = k + 1; h < n; h++) {
					if (test[k] > test[h])
						sum += gcd(test[k], test[h]);
					else
						sum += gcd(test[h], test[k]);
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
