// ���� ���� : https://blog.naver.com/hanjo1515/221997325210
package codeReview_11to20;

import java.util.Arrays;
import java.util.Scanner;

public class backjoon1759 {

	static char[] arr;
	static boolean[] tf;
	static int c, l;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		l = sc.nextInt(); // ��ȣ ����
		c = sc.nextInt(); // �ĺ� ����
		arr = new char[c];
		tf = new boolean[c]; //��Ʈ��ŷ

		for (int i = 0; i < c; i++) {
			arr[i] = sc.next().charAt(0); //str�� char�� ��ȯ
		}
		Arrays.sort(arr);
		
		dfs(0, 0, 0, 0);
		sc.close();
	}

	public static void dfs(int start, int depth, int jaeum, int moeum) {

		for (int i = start; i < c; i++) {
			tf[i] = true;
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
				dfs(i + 1, depth + 1, jaeum, moeum + 1);
			else
				dfs(i + 1, depth + 1, jaeum + 1, moeum);
			tf[i] = false;
		}
		
		if (depth == l && jaeum >= 2 && moeum >= 1) { //����
			for (int i = 0; i < c; i++) {
				if (tf[i] == true)
					System.out.print(arr[i]);
			}
			System.out.println("");
			return;
		}

	}
}
