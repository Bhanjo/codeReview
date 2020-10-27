// ���� ���� : https://blog.naver.com/hanjo1515/221857959622
package codeReview_1to10;

import java.util.Scanner;

public class backjoon9613 {

	public static int gcd(int x, int y) { // GCD���ϱ�
		if (y == 0)
			return x;
		else
			return gcd(y, x % y);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(); // �׽�Ʈ ĳ�̽� ����

		for (int i = 0; i < t; i++) {
			long sum = 0; // GCD�� ��
			int n = sc.nextInt(); // �Է¹��� ���� ����
			int[] test = new int[n]; // �׽�Ʈ ���̽�

			for (int j = 0; j < n; j++) { // ���� �Է�
				test[j] = sc.nextInt();
			}

			for (int k = 0; k < n - 1; k++) { // gcd�� ���� �� ���� (���Ʈ���� ����)
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
