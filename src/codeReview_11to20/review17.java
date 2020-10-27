// 문제 리뷰 : https://blog.naver.com/hanjo1515/221998255338
package codeReview_11to20;

import java.util.Scanner;

public class review17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // 테스트 케이스
		int tr = 1, fal = 0;

		for (int a = 0; a < t; a++) {

			int heigth = sc.nextInt(); // 세로
			int width = sc.nextInt(); // 가로
			int[][] box = new int[width][heigth]; // 박스
			int[] blockHeight = new int[heigth]; // 각 블록의 높이
			int heightMax = Integer.MIN_VALUE; // 높이의 최댓값
			int countBox = 0;

			// 박스 초기화
			for (int i = 0; i < width; i++) {
				for (int j = 0; j < heigth; j++) {
					box[i][j] = fal;
				}
			}

			// 높이 입력
			for (int i = 0; i < heigth; i++) {
				blockHeight[i] = sc.nextInt();
				for (int j = 0; j < blockHeight[i]; j++) {
					box[j][i] = tr;
				}
			}

			// 낙하 힘 카운트
			for (int i = 0; i < width; i++) {
				if (blockHeight[i] > 0) {
					countBox = 0;
					for (int j = i + 1; j < width; j++) {
						if (box[j][blockHeight[i] - 1] == fal)
							countBox = countBox + 1;
					}
				}
				if (countBox > heightMax)
					heightMax = countBox;
			}

			System.out.println(heightMax);
		}

	}
}
