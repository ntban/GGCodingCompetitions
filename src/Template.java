

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;

public class Template {
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
	}
}
