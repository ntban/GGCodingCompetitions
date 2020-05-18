package codejam2020.r1b;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Expogo {
	public static Scanner sc;

	public static void main(String[] args) throws Exception {
		sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			System.out.printf("Case #%d: ", tc);
			int x = sc.nextInt();
			int y = sc.nextInt();
			testCase(x, y);

		}
	}
	static class Point{
		int x, y;
		int steps;
		Point parent;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int directions[][] = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
	private static void testCase(int ex, int ey) {
		int value = 1;
		Point p = new Point(0, 0);
		Queue<Point> que = new LinkedList<>();
		que.add(p);
	}
}
