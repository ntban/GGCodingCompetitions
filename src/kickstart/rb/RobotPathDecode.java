package kickstart.rb;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class RobotPathDecode {
	public static Scanner sc;

	public static void main(String[] args) throws Exception {
		sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int T = Integer.parseInt(sc.nextLine());
		for (int tc = 1; tc <= T; tc++) {
			System.out.printf("Case #%d: ", tc);
			testCase();

		}
	}

	static int P_MIN = 1;
	static int P_MAX = 1000000000;
	static int X, Y;

	private static void testCase() {
		String s = sc.nextLine();
		X = 1;
		Y = 1;
		int i = 0;
		while (i < s.length()) {
			char dir = s.charAt(i);
			if (dir == 'N' || dir == 'E' || dir == 'S' || dir == 'W') {
				i++;
				move(dir);
				continue;
			}

			StringBuilder path = new StringBuilder();
			Stack<StElement> stack = new Stack<>();

			stack.push(new StElement(s.charAt(i++) - '0'));
			while (i < s.length() && !stack.isEmpty()) {
				char c = s.charAt(i++);
				if (c == '(') {
					continue;
				}
				if (c >= '2' && c <= '9') {
					stack.push(new StElement(c - '0'));
					continue;
				}
				if (c == 'N' || c == 'E' || c == 'S' || c == 'W') {
					stack.peek().path.append(c);
					continue;
				}
				if (c == ')') {
					StElement e = stack.pop();
					int count = e.num;
					StringBuilder curPath = new StringBuilder();
					while (count-- > 0) {
						curPath.append(e.path);
					}
					if(!stack.isEmpty()) {
						stack.peek().path.append(curPath);
					}else {
						path = curPath;
						//System.out.println(curPath);
					}
				}
			}

			for (int j = 0; j < path.length(); j++) {
				move(path.charAt(j));
			}

		}
		System.out.printf("%d %d\n", Y, X);
	}

	static class StElement {
		public int num;
		public StringBuilder path;

		StElement(int n) {
			num = n;
			path = new StringBuilder();
		}

	}

	private static void move(char dir) {
		switch (dir) {
		case 'E':
			Y++;
			if (Y == P_MAX + 1) {
				Y = P_MIN;
			}
			break;

		case 'S':
			X++;
			if (X == P_MAX + 1) {
				X = P_MIN;
			}
			break;

		case 'W':
			Y--;
			if (Y == P_MIN - 1) {
				Y = P_MAX;
			}
			break;

		case 'N':
			X--;
			if (X == P_MIN - 1) {
				X = P_MAX;
			}
			break;
		default:
			break;
		}
	}

}
