// 문제 리뷰 : https://blog.naver.com/hanjo1515/221918746649
package codeReview_11to20;

import java.util.Scanner;

public class backjoon10972 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] numArr = new int[n];

		for (int i = 0; i < numArr.length; i++) { // 배열 값 입력
			numArr[i] = sc.nextInt();
		}

		if (isNext(numArr) == true) { // isNext가 참일때
			for (int i = 0; i < numArr.length; i++) {
				System.out.println(numArr[i]);
			}
		} else // isNext가 거짓일때 내림차순이 된거니 -1 출력
			System.out.println("-1");
		
		sc.close();
	}

	public static boolean isNext(int[] numArr) {
		int i = numArr.length - 1; //배열 길이는 n이지만 배열저장은 0~n-1까지 저장된다.

		// 내림차순인지 파악
		while (i > 0) {
			if (numArr[i - 1] >= numArr[i]) { //앞에값이 뒤 값보다 클때
				i -= 1;
			} else // 만약 앞에값이 뒤에 값보다 작으면 while문 종료(오름차순)
				break;
		}
		
		if (i == 0) //i가 0까지 갔다는 것은 완벽한 내림차순으로 정리됐다는 것이다.
			return false;
		
		int j = numArr.length - 1;
		
        //어디서부터 내림차순인지 위치를 파악한다.
		while(numArr[i-1] >= numArr[j]) { //앞의값이 뒤에값보다 클때
			j -= 1;
		}
		
        //파악된 위치의 값과 앞에값을 서로 바꾼다.
		int temp = numArr[i - 1]; //값 서로 바꾸기
		numArr[i - 1] = numArr[j];
		numArr[j] = temp;
		
		j = numArr.length - 1;
		
        //파악된 위치의 값 기준으로 뒤에값은 오름차순으로 재정렬시켜준다.
		while(i < j) {
			temp = numArr[i];
			numArr[i] = numArr[j];
			numArr[j] = temp;
			i++;
			j--;
		}
		
		return true;
	}
}
