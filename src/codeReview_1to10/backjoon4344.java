package codeReview_1to10;

import java.util.Scanner;

public class backjoon4344 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt(); // �׽�Ʈ ���̽� ��
		int n; //�л� ��
		double result;
		
		for (int i = 0; i < c; i++) {
			int sum = 0; // ������ ��
			int avr = 0; // ���̽��� ���
			int count = 0; // ����̻��� ����� ī��Ʈ
			
			n = sc.nextInt();
			int [] score = new int[n]; // �л� ����
			for (int j = 0; j < n; j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			avr = (sum / n); //���� ���
			for (int ck = 0; ck < score.length; ck++) { //����������� ���� ������ ã��
				if (score[ck] > avr) count ++;
			}
			result = (double)count / n * 100;
			System.out.printf("%.3f",result); //������� ��°�ڸ����� �ݿø�ǥ�� 
			System.out.println("%");
		}
		sc.close();
	}
}

