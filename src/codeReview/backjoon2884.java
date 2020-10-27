package codeReview;

import java.util.Scanner;

public class backjoon2884 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h, m, rem; // h : hour , m = minute, rem = result minute
		boolean count; // 시간의 범위 확인용

		while (true) {
			h = sc.nextInt();
			m = sc.nextInt();

			// 시간의 범위 확인
			boolean checkhour = ((h >= 0 && h < 24) ? true : false); // 0~23 사이 값일때 참, 아닐때 거짓
			boolean checkminute = ((m >= 0 && m < 60) ? true : false); // 0~59 사이 값일때 참, 아닐때 거짓

			if (checkhour == true && checkminute == true) {
				if ((m - 45) < 0) { // 입력받은 분초가 45보다 작을때
					h--;
					rem = 60 + (m - 45);
					if (h <= 0) // 시초가 0 이하일때 23시로 바꿔준다(0 = 24 이기때문)
						h = 23;
				} else  // 입력받은 분초가 45보다 클때
					{ rem = m - 45; }
				System.out.println(h + " " + rem);
				count = true;
			} else {
				System.out.println("범위초과 다시입력하세요.");
				count = false;
			}

			if (count == true) // 정상 출력일시 결과출력 후 종료, 입력값이 범위초과시 while로 돌아가 재입력
				break;
		}
		sc.close();
	}

}

