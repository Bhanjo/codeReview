package codeReview_31to40;

import java.util.*;

public class review35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			int stdNum = sc.nextInt(); // 총 학생 수
			int findStd = sc.nextInt() - 1; // 찾을 학생
			double std[] = new double[stdNum];
			int cnt = 0;
			String[] grade = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};

			for (int i = 0; i < stdNum; i++) {
				int termTest = sc.nextInt(), finalTest = sc.nextInt(), homework = sc.nextInt();
				double testNum = termTest * 0.35 + finalTest * 0.45 + homework * 0.2;
				std[i] = testNum;
			}
			
			for(int j = 0; j < stdNum; j++) {	
				if(std[findStd] > std[j])
					cnt++;
			}
			if(stdNum > 10)
				cnt = cnt/(stdNum/10);
			System.out.println("#" + tc + " " + grade[cnt] + " " + cnt);
		}
		
		sc.close();
	}
}
