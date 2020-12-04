package codeReview_31to40;

import java.util.Scanner;

public class review37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			int btn = sc.nextInt();
			int bcnt = 0, ocnt = 0, cnt = 0;
			int bpos = 1, opos = 1;

			for (int i = 0; i < btn; i++) {
				String robot = sc.next();
				int distan = sc.nextInt();
				
				if (robot.equals("B")) {
					int time = (bcnt >= Math.abs(bpos-distan))? 1:1+Math.abs(bpos-distan)-bcnt;
					cnt += time;
					ocnt += time;
					bcnt = 0;
					bpos = distan;
				} else if (robot.equals("O")) {
					int time = (ocnt >= Math.abs(opos-distan))? 1:1+Math.abs(opos-distan)-ocnt;
					cnt += time;
					bcnt += time;
					ocnt = 0;
					opos = distan;
				}
			}
			System.out.println("#" + tc + " " + cnt);
		}
		sc.close();
	}
}
