// ¹®Á¦ ¸®ºä : https://blog.naver.com/hanjo1515/222019096826
package codeReview_21to30;

import java.util.*;

public class review27 {

	static int num, power;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int test_case = 1; test_case <= T; test_case++) {
			int testNum = sc.nextInt();
			num = sc.nextInt();
			power = sc.nextInt();
			
			//result(num, power);
			System.out.println("#" + test_case + " " + result(num,power));
		}
		sc.close();
	}
	
	public static int result(int num, int power) {
		if(num > 1 && power > 0)
			return num*result(num,power-1);
		else
			return 1;
	}
}
