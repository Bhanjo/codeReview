// ¹®Á¦ ¸®ºä : https://blog.naver.com/hanjo1515/222022720105
package codeReview_21to30;

import java.util.*;

public class review29 {
	
	public static int[] root1 = new int[100];
	public static int[] root2 = new int[100];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int test_case = 1; test_case <= T; test_case++) {
            int testNum = sc.nextInt();
            int line = sc.nextInt();
            
			for(int i = 0; i < 100; i++) {
				root1[i] = 0;
				root2[i] = 0;
			}
			for(int i = 0; i < line; i++) {
				int r1 = sc.nextInt();
				int r2 = sc.nextInt();
				
				if(root1[r1] == 0)
					root1[r1] = r2;
				else
					root2[r1] = r2; 
			}
			System.out.println("#" + test_case + " " + cal(0));
		}
		sc.close();
	}
	
	public static int cal(int index) {
		if(index == 99)
			return 1;
        
		int result = 0;
		
		if(root1[index] != 0) {
			result = cal(root1[index]);
		}
		if(result == 0 && root2[index] != 0) {
			result = cal(root2[index]);
		}
		return result;
	}
}
