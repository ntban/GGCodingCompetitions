package codejam2020.r1a;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution2 {
	static int sizeMatrix = 35;
	static long pMatrix[][] = new long[sizeMatrix + 1][sizeMatrix + 1];

	public static void buildMatrix() {

		int r = 1;
		boolean check = true;
		while (r <= sizeMatrix && check) {
			pMatrix[r][1] = 1;
			for (int i = 2; i < r; i++) {
				pMatrix[r][i] = pMatrix[r - 1][i - 1] + pMatrix[r - 1][i];
			}
			pMatrix[r][r] = 1;
			r++;
		}

	}

	public static void main(String[] args) throws Exception {
		buildMatrix();

		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			System.out.printf("Case #%d:\n", tc);
			sum = sc.nextLong();
			testCase();

		}
	}

	static boolean check[][];
	static ArrayDeque<Node> queue;

	static int dx[] = { 0, 0, -1, -1, 1, 1 };
	static int dy[] = { 1, -1, -1, 0, 0, 1 };

	static long sum;

	private static void testCase() {
		// bfs
		check = new boolean[sizeMatrix + 1][sizeMatrix + 1];
		queue = new ArrayDeque<>();

	}

}

class Node{
	int r;
	int k;
	long pLen;
	long value;
	public Node(int r, int k, long pLen, long value) {
		super();
		this.r = r;
		this.k = k;
		this.pLen = pLen;
		this.value = value;
	}
}