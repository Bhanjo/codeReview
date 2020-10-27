package codeReview;
import java.util.*;

public class backjoon2839 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n, tcount=0; //설탕의 무게, 3을 뺀 횟수
		
		n = sc.nextInt(); // 설탕 무게 입력받음
        
			while(true) {
				if(n%5 == 0) { // n이 5로 바로 나눠질 때
					System.out.println(n/5 + tcount);
					break;
				} else if(n <=0) { // n이 3,5 어떠한 수로도 나눠지지 않을 때
					System.out.println("-1");
					break;
				}
					n -= 3; // 5로 나눠떨어지지 않고 음수도 아니면 n을 3 뺀다
					tcount ++; //3뺀 횟수 카운트
			}	
		sc.close();
	}
}
