// ���� ���� : https://blog.naver.com/hanjo1515/222002748115
package codeReview_11to20;

import java.util.*;

public class review20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = 10;
		
		for(int test_case = 1; test_case <= 10; test_case++) {
			int []garo = new int[100]; //���α��̴� 100
			int dump = sc.nextInt(); //���� Ƚ��
			
			//���� 1~100 ����
			for(int i = 0; i < garo.length; i++) {
				garo[i] = sc.nextInt();
			}
			
			//���� ����
			for(int i = 0; i < dump; i++) {
				Arrays.sort(garo);
				garo[99]--;
				garo[0]++;
			}
			Arrays.sort(garo);
			int total = garo[99]-garo[0];
			
			System.out.println("#" + test_case + " " + total);
		}
		
		sc.close();
	}
}
