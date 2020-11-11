package codeReview_31to40;

import java.util.*;

public class review34 {
	
	static boolean checkPalin(int i) {
		String palinNum = Integer.toString(i);
		int palinNumSize = palinNum.length();
		for(int j = 0; j < palinNumSize/2; j++) {
			if(palinNum.charAt(j) != palinNum.charAt(palinNumSize-j-1) )
				return false;
		}
		double square = Math.sqrt(i); //루트i 값을 반환
		
		//루트씌운값이 제곱인지 판별
		if(square != (int)square) {
			return false;
		}
		
		int palinNum2 = (int)square;
		String square2 = Integer.toString(palinNum2);
		int square2Size = square2.length();
		for(int j = 0; j < square2Size; j++) {
			if(square2.charAt(j) != square2.charAt(square2Size-j-1))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int test_case = 1; test_case <= t; test_case++) {
			int fir = sc.nextInt(), sec = sc.nextInt();
			int palin = 0;
			
			for (int i = fir; i <= sec; i++) {
				if(checkPalin(i) == true) {
					palin++;
					System.out.println(i);
				}
					
			}
			System.out.println("#" + test_case + " " + palin);

		}
		sc.close();
	}
}
