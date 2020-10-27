// 문제 리뷰 : https://blog.naver.com/hanjo1515/222006050525
package codeReview_21to30;

import java.util.*;

public class review23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = 10;

		for (int test_case = 1; test_case <= T; test_case++) {
			int testNum = sc.nextInt();
			int[][] ladder = new int[100][100]; // 사다리
			int  shortcut = Integer.MAX_VALUE, shortcutPoint = 0;
			
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					ladder[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < 100; i++) {
				if (ladder[0][i] == 1) {
					int x = 0, y = i, moveCount = 0;
					int shortcutStart = y;
					while (x < 100) {
						if (y < 99 && ladder[x][y + 1] == 1) {
							y++;
							moveCount++;
							while (y < 100 && ladder[x-1][y] == 0) {
								y++;
								moveCount++;
							}
							x++;
							moveCount++;
						} else if (y > 0 && ladder[x][y - 1] == 1) {
							y--;
							moveCount++;
							while (y > 0 && ladder[x-1][y] == 0) {
								y--;
								moveCount++;
							}
							x++;
							moveCount++;
						} else {
							x++;
							//moveCount++;
						}
					}
					if (moveCount <= shortcut) {
						shortcut = moveCount;
						shortcutPoint = shortcutStart;
					}
				}
			}
			System.out.println("#" + test_case + " " + shortcutPoint);
		}

		sc.close();
	}
}
