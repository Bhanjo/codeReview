// ���� ���� https://blog.naver.com/hanjo1515/222005023061
package codeReview_21to30;

import java.util.Scanner;

public class review22 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for (int test_case = 1; test_case <= T; test_case++) {
			int testNum = sc.nextInt();
			int[][] ladder = new int[100][100]; // ��ٸ�
			int x = 99, y = 0;

			// ��ٸ� �Է�
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					ladder[i][j] = sc.nextInt();

					// ���������� ���۵ǵ��� ����
					if (ladder[i][j] == 2)
						y = j;
				}
			}

			// ��ٸ� �̵�
			while (x > 0) {
				// �������� �����̱�
				if (y > 0 && ladder[x][y - 1] == 1) {
					y--;
					while (y > 0 && ladder[x - 1][y] == 0)
						y--;
					x--;
				}
				// ���������� �����̱�
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
