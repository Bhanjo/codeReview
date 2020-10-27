// 문제 리뷰 : https://blog.naver.com/hanjo1515/221848542687
package codeReview_1to10;

import java.util.*;

public class backjoon2609 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		sc.close();
		int high = (a > b) ? a : b;
		int low = (a > b) ? b : a;
		int n = 1, maxtop = 0, mingop = 0; // n = 나눌 수, 최대공약수, 최소공배수

		while (true) { // 최대공약수 구하기
			if (n > low)
				break;
			if (a % n == 0 && b % n == 0 && n > maxtop)
				maxtop = n;
			n++;
		}
		while (true) { // 최소 공배수 구하기
			if (high % low == 0) {
				mingop = high;
				break;
			} else if ((n % a == 0 && n % b == 0)) {
				mingop = n;
				break;
			}
			n++;
		}
		System.out.println(maxtop);
		System.out.println(mingop);

	}

}
