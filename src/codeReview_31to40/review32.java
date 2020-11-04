package codeReview_31to40;

import java.util.*;

public class review32 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 1; i <= t; i++) {
			int marketDay = sc.nextInt(); // �Ÿ� �Ⱓ
			int price[] = new int[marketDay]; // �Ⱓ�� �ŸŰ�
			long money = 0, maxPrice = 0;

			// �ŸŰ� �Է�
			for (int j = 0; j < marketDay; j++) {
				price[j] = sc.nextInt();
			}

			// ����� ���
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
