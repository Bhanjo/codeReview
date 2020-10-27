// 문제 리뷰 : https://blog.naver.com/hanjo1515/222009573508
package codeReview_21to30;

import java.util.Scanner;

public class review24 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for (int test_case = 1; test_case <= T; test_case++) {
			int testNum = sc.nextInt();
			String keyword = sc.next(); // 찾아야할 키워드
			String str = sc.next(); // 문자열
			int charCount = 0; // 일치하는 횟수
			// int endChar = str.length() + 1;

			// 일치 판별
			for (int i = 0; i <= str.length() - keyword.length(); i++) {
				if (keyword.equals(str.substring(i, i + keyword.length())))
					charCount++;
			}

			System.out.println("#" + testNum + " " + charCount + " ");
			// System.out.print(str.substring(1,2));
		}
	}
}
