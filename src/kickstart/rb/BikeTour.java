package kickstart.rb;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BikeTour {
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
		int a[] = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 1; i < N - 1; i++) {
			if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}
