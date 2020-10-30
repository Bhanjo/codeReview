package codeReview_31to40;

import java.util.*;

public class review31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for (int test_case = 1; test_case <= T; test_case++) {
			sc.nextInt();
			String str = sc.next();
			String postfix = "";

			Stack<String> stack = new Stack<>(); // ���� ����
			
			for (int i = 0; i < str.length(); i++) {
				// str.charAt(i)�� ���� �������� �ƴ����� �Ǻ�
				if (Character.isDigit(str.charAt(i))) {
					postfix += Character.toString(str.charAt(i));
				} else {
					if (stack.empty())
						stack.push(Character.toString(str.charAt(i)));
					else {
						while (!stack.empty()) {
							// ������ ������ �д´�
							if (Prec(stack.peek()) >= Prec(Character.toString(str.charAt(i))))
								postfix += stack.pop();
							else
								break;
						}
						stack.push(Character.toString(str.charAt(i)));
					}
				}
			}
			if (!stack.empty()) {
				//���ÿ� ��簪�� postfix�� ����
				while (!stack.empty())
					postfix += stack.pop();
			}
			int result = CalcPostfix(postfix);
			System.out.println("#" + test_case + " " + result);
		}
	}

	// �켱���� �Ǵ� ���ϰ��� ũ�� �켱������ ���ٴ� ���̴�.
	private static int Prec(String op) {
		switch (op) {
		case "+":
			return 1;
		case "*":
			return 2;
		}
		return -1;
	}

	// ������ ����
	private static int CalcPostfix(String postfix) {
		int a, b = 0;
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < postfix.length(); i++) {
			if (Character.isDigit(postfix.charAt(i)))
				stack.push(postfix.charAt(i) - '0');
			else {
				a = stack.pop();
				b = stack.pop();
				
				//postfix�� �����ڿ����� ��갪 ���ÿ� push
				switch (postfix.charAt(i)) {
				case '+':
					stack.push(a + b);
					break;
				case '*' :
					stack.push(a * b);
					break;
				}
			}
		}
		return stack.pop();
	}
}
