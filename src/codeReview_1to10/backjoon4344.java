package codeReview_1to10;

import java.util.Scanner;

public class backjoon4344 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt(); // 테스트 케이스 수
		int n; //학생 수
		double result;
		
		for (int i = 0; i < c; i++) {
			int sum = 0; // 점수의 합
			int avr = 0; // 케이스별 평균
			int count = 0; // 평균이상인 사람의 카운트
			
			n = sc.nextInt();
			int [] score = new int[n]; // 학생 점수
			for (int j = 0; j < n; j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			avr = (sum / n); //점수 평균
			for (int ck = 0; ck < score.length; ck++) { //평균점수보다 높은 점수를 찾기
				if (score[ck] > avr) count ++;
			}
			result = (double)count / n * 100;
			System.out.printf("%.3f",result); //결과값을 셋째자리까지 반올림표현 
			System.out.println("%");
		}
		sc.close();
	}
}

