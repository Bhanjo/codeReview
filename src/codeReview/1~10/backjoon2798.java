// ���� ���� : https://blog.naver.com/hanjo1515/221813938177

package codeReview;

import java.util.Scanner;

public class backjoon2798 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), m = sc.nextInt(); // n : ī�� �� / m : ������� ��
		int cardnum[] = new int[n]; // ī�忡 ���� ���� �迭
		int totalnum, result = 0; // ī�忡 ���� ������ ��, ������� ���� ���� ����� ��

		for (int a = 0; a < n; a++) { // ī�忡 ���� ���� �Է�
			cardnum[a] = sc.nextInt();
		}
		
		for (int i = 0; i < cardnum.length - 2; i++) {
			for (int j = i + 1; j < cardnum.length - 1; j++) {
				for (int k = j + 1; k < cardnum.length; k++) {
					totalnum = cardnum[i] + cardnum[j] + cardnum[k];
					if (totalnum > result && totalnum <= m) { // ��ģ ���� ������ ���ں��� ������ ����� ����
						result = totalnum;
					}
					if (totalnum == m) {
						break;
					}
				}
			}
		}
		System.out.println(result);

		sc.close();
	}
}
