// ���� ���� : https://blog.naver.com/hanjo1515/221918746649
package codeReview_11to20;

import java.util.Scanner;

public class backjoon10972 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] numArr = new int[n];

		for (int i = 0; i < numArr.length; i++) { // �迭 �� �Է�
			numArr[i] = sc.nextInt();
		}

		if (isNext(numArr) == true) { // isNext�� ���϶�
			for (int i = 0; i < numArr.length; i++) {
				System.out.println(numArr[i]);
			}
		} else // isNext�� �����϶� ���������� �ȰŴ� -1 ���
			System.out.println("-1");
		
		sc.close();
	}

	public static boolean isNext(int[] numArr) {
		int i = numArr.length - 1; //�迭 ���̴� n������ �迭������ 0~n-1���� ����ȴ�.

		// ������������ �ľ�
		while (i > 0) {
			if (numArr[i - 1] >= numArr[i]) { //�տ����� �� ������ Ŭ��
				i -= 1;
			} else // ���� �տ����� �ڿ� ������ ������ while�� ����(��������)
				break;
		}
		
		if (i == 0) //i�� 0���� ���ٴ� ���� �Ϻ��� ������������ �����ƴٴ� ���̴�.
			return false;
		
		int j = numArr.length - 1;
		
        //��𼭺��� ������������ ��ġ�� �ľ��Ѵ�.
		while(numArr[i-1] >= numArr[j]) { //���ǰ��� �ڿ������� Ŭ��
			j -= 1;
		}
		
        //�ľǵ� ��ġ�� ���� �տ����� ���� �ٲ۴�.
		int temp = numArr[i - 1]; //�� ���� �ٲٱ�
		numArr[i - 1] = numArr[j];
		numArr[j] = temp;
		
		j = numArr.length - 1;
		
        //�ľǵ� ��ġ�� �� �������� �ڿ����� ������������ �����Ľ����ش�.
		while(i < j) {
			temp = numArr[i];
			numArr[i] = numArr[j];
			numArr[j] = temp;
			i++;
			j--;
		}
		
		return true;
	}
}
