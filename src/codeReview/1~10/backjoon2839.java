package codeReview;
import java.util.*;

public class backjoon2839 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n, tcount=0; //������ ����, 3�� �� Ƚ��
		
		n = sc.nextInt(); // ���� ���� �Է¹���
        
			while(true) {
				if(n%5 == 0) { // n�� 5�� �ٷ� ������ ��
					System.out.println(n/5 + tcount);
					break;
				} else if(n <=0) { // n�� 3,5 ��� ���ε� �������� ���� ��
					System.out.println("-1");
					break;
				}
					n -= 3; // 5�� ������������ �ʰ� ������ �ƴϸ� n�� 3 ����
					tcount ++; //3�� Ƚ�� ī��Ʈ
			}	
		sc.close();
	}
}
