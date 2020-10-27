// 문제 리뷰 : https://blog.naver.com/hanjo1515/221926710245
package codeReview_11to20;

import java.util.Scanner;

public class backjoon10974 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		int num = 1;
		
		for(int i = 0; i < arr.length; i++) { //배열에 1~n까지 숫자 자동입력
			arr[i] = num;
			num++;
		}

		while (true) { //내림차순이 될때까지 반복한다.
			
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			int nextLo = arr.length - 1;

			// 내림차순인지 확인
			while (nextLo > 0) {
				if (arr[nextLo - 1] >= arr[nextLo])
					nextLo -= 1;
				else
					break;
			}
			if (nextLo == 0) // nextLo = 0일때 내림차순으로 정렬된 것임
				break;

			int nextCompare = arr.length - 1;

			//기준점 찾기
			while (arr[nextLo - 1] >= arr[nextCompare]) {
				nextCompare -= 1;
			}

			// 값 바꾸기
			int temp = arr[nextLo-1];
			arr[nextLo-1] = arr[nextCompare];
			arr[nextCompare] = temp;
			
			//기준점 이후의 값 재정렬
			nextCompare = arr.length - 1;
			while (nextLo < nextCompare) {
				temp = arr[nextLo];
				arr[nextLo] = arr[nextCompare];
				arr[nextCompare] = temp;

				nextLo++;
				nextCompare--;
			}
			
		}
		sc.close();
	}
}
