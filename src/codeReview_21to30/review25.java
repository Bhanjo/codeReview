// 문제 리뷰 : https://blog.naver.com/hanjo1515/222009903892
package codeReview_21to30;

import java.util.*;

public class review25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = 10;

		for (int test_case = 1; test_case <= T; test_case++) {
			int strNum = sc.nextInt();
			char arr[][] = new char[8][8];
			boolean sw = true;
			int count = 0;

			// 스트링을 입력받아 각 문자로 쪼개어 저장
			for (int i = 0; i < 8; i++) {
				String str = sc.next();
				for (int j = 0; j < 8; j++) {
					arr[i][j] = str.charAt(j);
				}
			}

			// 가로 구하기
			for (int i = 0; i < 8; i++) {

				// i번째줄 판별
				for (int j = 0; j <= 8-strNum; j++) {
					sw = true;
					for (int k = 0; k < (strNum / 2); k++) {
						if (arr[i][j + k] != arr[i][strNum+j - 1 - k])
							sw = false;
					}
					if (sw == true)
						count++;
				}
			}

			// 세로 구하기
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j <= 8-strNum; j++) {
					sw = true;
					for (int k = 0; k < (strNum / 2); k++) {
						if (arr[j + k][i] != arr[strNum - 1 + j - k][i])
							sw = false;
					}
					if (sw == true)
						count++;
				}
			}
			System.out.println("#" + test_case + " " + count);
		}
		sc.close();
	}
}
