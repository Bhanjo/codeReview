package codeReview_31to40;

import java.util.*;

public class review36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 10이사 1000이하

		for (int i = 1; i <= num; i++) {
			String numStr = Integer.toString(i);
			int numStrlength = numStr.length();
			int cnt = 0;

			for (int j = 0; j < numStrlength; j++) {
				if (numStr.charAt(j) == '3' || numStr.charAt(j) == '6' || numStr.charAt(j) == '9')
					cnt++;
			}
			if (cnt > 0) {
				while (cnt != 0) {
					System.out.print("-");
					cnt--;
				}
				System.out.print(" ");
			} else
				System.out.print(i + " ");
		}
		sc.close();
	}
}
