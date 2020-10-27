// 문제 리뷰 : https://blog.naver.com/hanjo1515/221813938177

package codeReview;

import java.util.Scanner;

public class backjoon2798 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), m = sc.nextInt(); // n : 카드 수 / m : 맞춰야할 수
		int cardnum[] = new int[n]; // 카드에 적인 숫자 배열
		int totalnum, result = 0; // 카드에 적힌 숫자의 합, 맞춰야할 수에 가장 가까운 수

		for (int a = 0; a < n; a++) { // 카드에 적을 숫자 입력
			cardnum[a] = sc.nextInt();
		}
		
		for (int i = 0; i < cardnum.length - 2; i++) {
			for (int j = i + 1; j < cardnum.length - 1; j++) {
				for (int k = j + 1; k < cardnum.length; k++) {
					totalnum = cardnum[i] + cardnum[j] + cardnum[k];
					if (totalnum > result && totalnum <= m) { // 합친 값이 지정된 숫자보다 작을시 결과값 저장
						result = totalnum;
					}
					if (totalnum == m) {
						break;
					}
				}
			}
		}
		System.out.println(result);

		sc.close();
	}
}
