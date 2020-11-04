package codeReview_31to40;

import java.util.*;

public class review32 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 1; i <= t; i++) {
			int marketDay = sc.nextInt(); // 매매 기간
			int price[] = new int[marketDay]; // 기간별 매매가
			long money = 0, maxPrice = 0;

			// 매매가 입력
			for (int j = 0; j < marketDay; j++) {
				price[j] = sc.nextInt();
			}

			// 사재기 계산
			for (int k = marketDay-1; k > 0; k--) {
				if(maxPrice <= price[k])
					maxPrice = price[k];
				
				if(maxPrice < price[k-1])
					continue;
				else
					money += maxPrice-price[k-1];
			}
			System.out.println("#" + i + " " + money);

		}
		sc.close();
	}
}
