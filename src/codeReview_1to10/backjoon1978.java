// ���� ���� : https://blog.naver.com/hanjo1515/221868712289
package codeReview_1to10;

import java.util.Scanner;

public class backjoon1978 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // ���� ����

		int count = 0; // �Ҽ� ã���� ī��Ʈ
		boolean tf = true; // �Ҽ��Ǻ�

		while (n-- > 0) {
			int sosu = sc.nextInt();

			if (sosu <= 1) // �ؼ�_1
				tf = false;
			
			for (int j = 2; j < sosu; j++) { // �ؼ�_2
				if (sosu % j == 0)
					tf = false;
			}
			
			if (tf == true)
				count++;
			tf=true; //�ؼ�_3
		}
		System.out.println(count);
		sc.close();
	}
}
