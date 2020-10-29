package codeReview_21to30;

import java.util.*;

public class review30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = 10;
		Scanner sc = new Scanner(System.in);

		// 입력시작
		for (int test_case = 1; test_case <= T; test_case++) {
			int strlength = sc.nextInt();
			int num = 0, hap = 0;
			String str = sc.next();
			String changeStr = str.replaceAll("[^0-9]", "");
			
			for (int i = 0; i < changeStr.length(); i++) {
					num = Integer.valueOf(changeStr.charAt(i)-'0');
					hap += num;
				}

			System.out.println("#" + test_case + " " + hap);
		}
		sc.close();
	}

}
