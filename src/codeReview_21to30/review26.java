// 문제 리뷰 : https://blog.naver.com/hanjo1515/222013044639
package codeReview_21to30;

import java.util.*;

public class review26 {

	static char arr[][];
	static int maxCount;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		arr= new char[100][100];
		
		for (int test_case = 1; test_case <= T; test_case++) {
			maxCount = Integer.MIN_VALUE;
			boolean sw = true;
			int testNum = sc.nextInt();

			// 스트링을 입력받아 각 문자로 쪼개어 저장
			for (int i = 0; i < 100; i++) {
				String str = sc.next();
				for (int j = 0; j < 100; j++) {
					arr[i][j] = str.charAt(j);
				}
			}

			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					for (int k = 2; k < 100; k++) {
						if (j + k <= 100)
							hor(i, j, k);
						if (i + k <= 100)
							ver(i, j, k);
					}
				}
			}
			System.out.println("#" + test_case + " " + maxCount);
		}
		sc.close();
	}

	static void hor(int x, int y, int last) {
		int startX = x, startY = y, endY = last+y-1;
		boolean sw = false;
		while(true) {
			if(startY > endY) {
				sw = true;
				break;
			}
			if(arr[startX][startY] == arr[startX][endY]) {
				startY++;
				endY--;
			} else
				break;
		}
		if(sw == true && maxCount < last)
			maxCount = last;
	}

	static void ver(int x, int y, int last) {
		int startX = x, startY = y, endX = last+x-1;
		boolean sw = false;
		while(true) {
			if(startX > endX) {
				sw = true;
				break;
			}
			if(arr[startX][startY] == arr[endX][startY]) {
				startX++;
				endX--;
			} else
				break;
		}
		if(sw == true && maxCount < last)
			maxCount = last;
	}
}
