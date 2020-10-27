// 문제 리뷰 https://blog.naver.com/hanjo1515/222005023061
package codeReview_21to30;

import java.util.Scanner;

public class review22 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for (int test_case = 1; test_case <= T; test_case++) {
			int testNum = sc.nextInt();
			int[][] ladder = new int[100][100]; // 사다리
			int x = 99, y = 0;

			// 사다리 입력
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					ladder[i][j] = sc.nextInt();

					// 도착점부터 시작되도록 설정
					if (ladder[i][j] == 2)
						y = j;
				}
			}

			// 사다리 이동
			while (x > 0) {
				// 왼쪽으로 움직이기
				if (y > 0 && ladder[x][y - 1] == 1) {
					y--;
					while (y > 0 && ladder[x - 1][y] == 0)
						y--;
					x--;
				}
				// 오른쪽으로 움직이기
				else if (y < 99 && ladder[x][y + 1] == 1) {
					y++;
					while (y < 100 && ladder[x - 1][y] == 0)
						y++;
					x--;
				} else
					x--;
			}

			System.out.println("#" + test_case + " " + y);
		}

	}
}
