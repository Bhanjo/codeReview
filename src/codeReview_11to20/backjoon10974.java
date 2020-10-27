// ���� ���� : https://blog.naver.com/hanjo1515/221926710245
package codeReview_11to20;

import java.util.Scanner;

public class backjoon10974 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		int num = 1;
		
		for(int i = 0; i < arr.length; i++) { //�迭�� 1~n���� ���� �ڵ��Է�
			arr[i] = num;
			num++;
		}

		while (true) { //���������� �ɶ����� �ݺ��Ѵ�.
			
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			int nextLo = arr.length - 1;

			// ������������ Ȯ��
			while (nextLo > 0) {
				if (arr[nextLo - 1] >= arr[nextLo])
					nextLo -= 1;
				else
					break;
			}
			if (nextLo == 0) // nextLo = 0�϶� ������������ ���ĵ� ����
				break;

			int nextCompare = arr.length - 1;

			//������ ã��
			while (arr[nextLo - 1] >= arr[nextCompare]) {
				nextCompare -= 1;
			}

			// �� �ٲٱ�
			int temp = arr[nextLo-1];
			arr[nextLo-1] = arr[nextCompare];
			arr[nextCompare] = temp;
			
			//������ ������ �� ������
			nextCompare = arr.length - 1;
			while (nextLo < nextCompare) {
				temp = arr[nextLo];
				arr[nextLo] = arr[nextCompare];
				arr[nextCompare] = temp;

				nextLo++;
				nextCompare--;
			}
			
		}
		sc.close();
	}
}
