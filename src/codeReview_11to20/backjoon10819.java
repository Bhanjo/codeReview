// 문제 리뷰 : https://blog.naver.com/hanjo1515/221952020759
package codeReview_11to20;

import java.util.Arrays;
import java.util.Scanner;

public class backjoon10819 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 입력받을 수의 갯수
		int[] A = new int[n]; // 배열A

		// 입력 후 정렬
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		isNext(A);
	}

	public static void isNext(int []A) {
		int max = Integer.MIN_VALUE; // 최대값을 int의 가장 작은값으로 초기화
		
		//정렬 알고리즘(이전포스팅 내용)
		while (true) {
			int nextLo = A.length - 1;

			while (nextLo > 0) { // 내림차순확인
				if (A[nextLo - 1] >= A[nextLo])
					nextLo -= 1;
				else
					break;
			}
			if (nextLo == 0) // 내림차순일 시 끝까지 진행한거임
				break;

			int nextCompare = A.length - 1;
			while (A[nextLo - 1] >= A[nextCompare]) {
				nextCompare -= 1;
			}

			int temp = A[nextLo - 1];
			A[nextLo - 1] = A[nextCompare];
			A[nextCompare] = temp;

			nextCompare = A.length - 1;

			while (nextLo < nextCompare) {
				temp = A[nextLo];
				A[nextLo] = A[nextCompare];
				A[nextCompare] = temp;
				nextLo++;
				nextCompare--;
			}
			
			//계산한 값과 max값을 비교
			int result = 0;
			for (int i = 0; i < A.length-1; i++) {
				result += Math.abs(A[i] - A[i + 1]);
			}
			max = Math.max(result, max);

		}
		System.out.println(max);

	}
}