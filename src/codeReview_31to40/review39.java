package codeReview_31to40;

import java.util.*;

public class review39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		for (int testCase = 1; testCase <= tc; testCase++) {
			int ckBit = sc.nextInt(); // 비트판별 범위
			int num = sc.nextInt();
			String answer = "ON";

			for (int i = 0; i < ckBit; i++) {
				if (num % 2 == 1)
					num = num / 2;
				else
					answer = "OFF";
			}
			System.out.println("#" + testCase + " " + answer);
		}
		sc.close();
	}
}
