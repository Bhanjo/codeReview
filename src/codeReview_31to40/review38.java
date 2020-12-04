package codeReview_31to40;

import java.util.*;

public class review38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int tc = 1; tc <= t; tc++) {
			int totalPe = sc.nextInt();
			int subA = sc.nextInt(), subB = sc.nextInt();
			int maxOverlap = 0, minOverlap = 0;

			minOverlap = (totalPe >= subA + subB)? 0:subA+subB-totalPe;
			
			maxOverlap = (subA >= subB)? subB:subA;
			System.out.println("#" + tc + " " + maxOverlap + " " + minOverlap);
		}
		sc.close();
	}

}
