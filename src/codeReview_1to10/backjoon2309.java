// ���� ���� : https://blog.naver.com/hanjo1515/221874318797
package codeReview_1to10;

import java.util.Arrays;
import java.util.Scanner;

public class backjoon2309 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] high = new int[9];
		int sum = 0;
		int spyA = 0, spyB = 0;

		for (int i = 0; i < high.length; i++) { // ������ Ű �Է�
			high[i] = sc.nextInt();
			sum += high[i]; // sum�� ������ 9���� Ű�� ��
		}
		Arrays.sort(high); //Ű�� ���������� ����
		
		for(int a = 0; a < high.length-1; a++) { //���Ʈ ����
			for(int b = a+1; b < high.length; b++) {
				if(sum - high[a] - high[b] == 100) { //�ٽ�
					spyA = a;
					spyB = b;
					break;
				}
			}
		}
		
		for(int j = 0; j < high.length; j++) { // ��¥ ������ Ű ���
			if(j == spyA || j == spyB) //����
				continue;
			System.out.println(high[j]);
		}
		sc.close();
	}
}
