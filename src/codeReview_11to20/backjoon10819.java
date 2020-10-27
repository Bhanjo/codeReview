// ���� ���� : https://blog.naver.com/hanjo1515/221952020759
package codeReview_11to20;

import java.util.Arrays;
import java.util.Scanner;

public class backjoon10819 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // �Է¹��� ���� ����
		int[] A = new int[n]; // �迭A

		// �Է� �� ����
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		isNext(A);
	}

	public static void isNext(int []A) {
		int max = Integer.MIN_VALUE; // �ִ밪�� int�� ���� ���������� �ʱ�ȭ
		
		//���� �˰���(���������� ����)
		while (true) {
			int nextLo = A.length - 1;

			while (nextLo > 0) { // ��������Ȯ��
				if (A[nextLo - 1] >= A[nextLo])
					nextLo -= 1;
				else
					break;
			}
			if (nextLo == 0) // ���������� �� ������ �����Ѱ���
				break;

			int nextCompare = A.length - 1;
			while (A[nextLo - 1] >= A[nextCompare]) {
				nextCompare -= 1;
			}

			int temp = A[nextLo - 1];
			A[nextLo - 1] = A[nextCompare];
			A[nextCompare] = temp;

			nextCompare = A.length - 1;

			while (nextLo < nextCompare) {
				temp = A[nextLo];
				A[nextLo] = A[nextCompare];
				A[nextCompare] = temp;
				nextLo++;
				nextCompare--;
			}
			
			//����� ���� max���� ��
			int result = 0;
			for (int i = 0; i < A.length-1; i++) {
				result += Math.abs(A[i] - A[i + 1]);
			}
			max = Math.max(result, max);

		}
		System.out.println(max);

	}
}