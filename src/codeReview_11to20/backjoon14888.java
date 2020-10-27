// ¹®Á¦ ¸®ºä : https://blog.naver.com/hanjo1515/221994935616
package codeReview_11to20;

import java.util.Scanner;

public class backjoon14888 {
	static int n; // ÀÔ·Â °¹¼ö
	static int[]arr; // ÀÔ·Â ¼ýÀÚ
	static int[]arrCal;
	static int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		arr = new int[n];
		arrCal = new int[4];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arrCal.length; i++) {
			arrCal[i] = sc.nextInt();
		}

		dfs(1, arr[0]); // ¿ÏÀüÅ½»ö
		System.out.println(max);
		System.out.println(min);
	}

	static void dfs(int count, int sum) {
		
		for(int i = 0; i < 4; i++) {
			if(arrCal[i] != 0) { 
				arrCal[i]--;
				
				switch(i) { //Àç±Í
				case 0:
					dfs(count+1, sum+arr[count]);
					break;
				case 1:
					dfs(count+1, sum-arr[count]);
					break;
				case 2:
					dfs(count+1, sum*arr[count]);
					break;
				case 3:
					dfs(count+1, sum/arr[count]);
					break;
				}
				arrCal[i]++;
			}
		}
		if(count == n) {
			if(min > sum)
				min = sum;
			if(max < sum)
				max = sum;
		}
	}
}
