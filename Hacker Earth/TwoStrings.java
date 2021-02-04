package HackerEarth;

import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a, b;
		int N, j, sum1, sum2;
		N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			sum1 = 0;
			sum2 = 0;
			a = scan.next();
			b = scan.next();
			for (j = 0; j < a.length(); j++) {
				sum1 = sum1 + (int) a.charAt(j);
			}
			for (j = 0; j < b.length(); j++) {
				sum2 = sum2 + (int) b.charAt(j);
			}

			if (sum1 == sum2) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		scan.close();
	}

}
