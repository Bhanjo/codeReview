package codeReview_31to40;

import java.util.Scanner;

public class review33 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
			int boxsize = sc.nextInt();
			int[][] arr = new int[boxsize][boxsize];
			int num = boxsize;
			int x = 0, y = -1;
			int cntNum = 1, dirNum = 1;
			
			while (cntNum <= boxsize*boxsize) {
				for (int i = 0; i < num; i++) {
					y = y + dirNum;
					arr[x][y] = cntNum;
					cntNum++;
				}
				num--;
				for (int j = 0; j < num; j++) {
					x = x + dirNum;
					arr[x][y] = cntNum;
					cntNum++;
				}
				dirNum = -dirNum;
			}
			
			//Ãâ·Â
			System.out.println("#" + test_case);
			for (int i = 0; i < boxsize; i++) {
				for (int j = 0; j < boxsize; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}

		}
		sc.close();
	}
}