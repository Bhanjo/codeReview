// ¹®Á¦ ¸®ºä : https://blog.naver.com/hanjo1515/222022600871
package codeReview_21to30;

import java.util.Scanner;
import java.util.Stack;

public class review28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int test_case = 1; test_case <= T; test_case++) {
			Stack<Character> stack = new Stack<>();
			int sw = 0;
			int length = sc.nextInt();
			//String dummy = sc.next();
			String line = sc.next();

			for (int i = 0; i < length; i++) {
				char bracket = line.charAt(i);
				if (bracket == '(' || bracket == '[' || bracket == '{' || bracket == '<')
					stack.push(bracket);
				else {
					if (stack.empty()) {
						sw = 0;
						break;
					}
					char top = stack.pop();
					if ((top == '(' && bracket == ')') || (top == '[' && bracket == ']')
							|| (top == '{' && bracket == '}') || (top == '<' && bracket == '>'))
						sw = 1;
					else {
						sw = 0;
						break;
					}
				}
			}
			if(!stack.empty()) {
				sw = 0;
			}
			System.out.println("#" + test_case + " " + sw);
		}
		sc.close();
	}
}
