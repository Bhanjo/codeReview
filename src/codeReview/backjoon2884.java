package codeReview;

import java.util.Scanner;

public class backjoon2884 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h, m, rem; // h : hour , m = minute, rem = result minute
		boolean count; // �ð��� ���� Ȯ�ο�

		while (true) {
			h = sc.nextInt();
			m = sc.nextInt();

			// �ð��� ���� Ȯ��
			boolean checkhour = ((h >= 0 && h < 24) ? true : false); // 0~23 ���� ���϶� ��, �ƴҶ� ����
			boolean checkminute = ((m >= 0 && m < 60) ? true : false); // 0~59 ���� ���϶� ��, �ƴҶ� ����

			if (checkhour == true && checkminute == true) {
				if ((m - 45) < 0) { // �Է¹��� ���ʰ� 45���� ������
					h--;
					rem = 60 + (m - 45);
					if (h <= 0) // ���ʰ� 0 �����϶� 23�÷� �ٲ��ش�(0 = 24 �̱⶧��)
						h = 23;
				} else  // �Է¹��� ���ʰ� 45���� Ŭ��
					{ rem = m - 45; }
				System.out.println(h + " " + rem);
				count = true;
			} else {
				System.out.println("�����ʰ� �ٽ��Է��ϼ���.");
				count = false;
			}

			if (count == true) // ���� ����Ͻ� ������ �� ����, �Է°��� �����ʰ��� while�� ���ư� ���Է�
				break;
		}
		sc.close();
	}

}

