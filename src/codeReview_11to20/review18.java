// ���� ���� : https://blog.naver.com/hanjo1515/221998636223
package codeReview_11to20;

import java.util.Scanner;
import java.util.Arrays;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		int[] caseNum = new int[T]; // ���̽� ��ȣ
		int[] score = new int[1000]; // ������ õ�� �޾ƾߵ�

		for (int test_case = 0; test_case < T; test_case++) {
			int scoreCount = 0, scoreMax = 0, topNum = 0; // �ֺ�� �Ǵ�
			caseNum[test_case] = sc.nextInt();

			// ���ھ� �Է�
			for (int j = 0; j < score.length; j++) {
				score[j] = sc.nextInt();
				if(score[j] < 0 || score[j] > 100)
					j--;
			}
			Arrays.sort(score);

			// �ֺ�� ���ϱ�
			for (int k = 0; k < score.length - 1; k++) {
				if (score[k] == score[k + 1]) {
					scoreCount++;
					if (scoreCount >= scoreMax) {
						scoreMax = scoreCount;
						topNum = score[k];
					}	
				} else
					scoreCount = 0;
			}

			System.out.println("#" + caseNum[test_case] + "  " + topNum);
		}
	}
}
