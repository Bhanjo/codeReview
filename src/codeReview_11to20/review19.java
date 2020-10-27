// 문제 리뷰 : https://blog.naver.com/hanjo1515/222001545435
package codeReview_11to20;

import java.util.*;

public class review19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 테스트 케이스는 10개
		for (int test = 1; test <= 2; test++) {
			int garo = sc.nextInt();
			int sum = 0;
			int[] building = new int[garo];
			
			for (int i = 0; i < garo; i++) {
				building[i] = sc.nextInt();
			}

			for (int i = 2; i < garo-2; i++) {
				int left = building[i-1], leftLeft = building[i-2], right = building[i+1], rightRight = building[i+2];
				int topNum = Math.max(Math.max(left, leftLeft), Math.max(right, rightRight));
				int temp = building[i]-topNum;
				
				if(temp > 0)
					sum += temp;
				
			}
			System.out.println("#" + test + " " + sum);
		}
		sc.close();
	}
}
