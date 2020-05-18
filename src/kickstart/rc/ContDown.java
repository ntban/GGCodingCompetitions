package kickstart.rc;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ContDown {
	public static Scanner sc;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			System.out.printf("Case #%d: ", tc);
			testCase();
		}
	}

	private static void testCase() {
		int N = sc.nextInt();
		int K = sc.nextInt();
		int A[] = new int[N];
		int count = 0;
		int next = -1;
		int start = -1;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			if (A[i] == K) {
				start = i;
				next = K;
			}
			if (start != -1) {
				if (A[i] == next) {
					next--;
					if (next == 0) {
						count++;
						start = -1;
					}
				}else start = -1;
			}
		}
		System.out.println(count);
	}
}
