// 문제 리뷰 : https://blog.naver.com/hanjo1515/222004638931
package codeReview_21to30;

import java.util.*;

public class review21 {
	public static void main(String args[]) throws Exception {
		// System.setIn(new FileInputStream("res/input.txt"));

		Scanner sc = new Scanner(System.in);
		int T = 10;

		for (int test_case = 1; test_case <= T; test_case++) {
			int[][] box = new int[100][100];
			int sum = 0;
			int max = Integer.MIN_VALUE;

			int testNum = sc.nextInt();

			// 행 값 구하기
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					box[i][j] = sc.nextInt();
					sum += box[i][j];
				}
				if (sum >= max)
					max = sum;
				sum = 0;
			}

			// 열 값 구하기
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					sum += box[j][i];
				}
				if (sum >= max)
					max = sum;
				sum = 0;
			}

			// 대각선 구하기
			for (int i = 0; i < 100; i++) {
				sum += box[i][i];
			}
			if (sum >= max)
				max = sum;
			sum = 0;

			// 대각선 반대 구하기
			int j = 99;
			for (int i = 0; i < 100; i++) {
				sum += box[i][j];
				j--;
			}
			if (sum >= max)
				max = sum;

			System.out.println("#" + test_case + " " + max);
		}
	}
}
