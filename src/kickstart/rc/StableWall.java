package kickstart.rc;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StableWall {
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
		int ans = 0;
		int n = sc.nextInt();
		int sum[] = new int[n];
		sum[0] = sc.nextInt();
		int max = 0;
		for (int i = 1; i < n; ++i) {
			sum[i] = sum[i - 1] + sc.nextInt();
			max = Math.max(max, sum[i]);
		}

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <= max; ++i) {
			if (i * i <= max) {
				list.add(i * i);
			} else
				break;
		}

		Map<Integer, Integer> map = new HashMap<>();
		if (isPerfect(sum[0])) ++ans;
		for (int i = 1; i < n; ++i) {
			for (int k = 0; k < i; ++k) {
				if (isPerfect(sum[i] - sum[k])) ++ans;
			}
			if (isPerfect(sum[i])) ++ans;
		}
		System.out.println(ans);
	}
	
	static boolean isPerfect(int val) {
		int e = (int) Math.sqrt(val);
		return e * e == val;
	}
}
