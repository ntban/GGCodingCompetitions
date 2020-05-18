package kickstart.rb;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BusRoute {
	public static Scanner sc;

	public static void main(String[] args) throws Exception {
		sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			System.out.printf("Case #%d: ", tc);
			testCase();

		}
	}

	private static void testCase() {
		int N = sc.nextInt();
		long D = sc.nextLong();
		long a[] = new long[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
		}
		long result = D;
		for (int i = N - 1; i >= 0; i--) {
			result = (result/a[i])*a[i];
		}
		System.out.println(result);
	}
}
