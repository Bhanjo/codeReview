// ���� ���� : https://blog.naver.com/hanjo1515/221998255338
package codeReview_11to20;

import java.util.Scanner;

public class review17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // �׽�Ʈ ���̽�
		int tr = 1, fal = 0;

		for (int a = 0; a < t; a++) {

			int heigth = sc.nextInt(); // ����
			int width = sc.nextInt(); // ����
			int[][] box = new int[width][heigth]; // �ڽ�
			int[] blockHeight = new int[heigth]; // �� ����� ����
			int heightMax = Integer.MIN_VALUE; // ������ �ִ�
			int countBox = 0;

			// �ڽ� �ʱ�ȭ
			for (int i = 0; i < width; i++) {
				for (int j = 0; j < heigth; j++) {
					box[i][j] = fal;
				}
			}

			// ���� �Է�
			for (int i = 0; i < heigth; i++) {
				blockHeight[i] = sc.nextInt();
				for (int j = 0; j < blockHeight[i]; j++) {
					box[j][i] = tr;
				}
			}

			// ���� �� ī��Ʈ
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
