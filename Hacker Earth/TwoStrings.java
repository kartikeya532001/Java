package HackerEarth;

import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a, b;
		int N, c;
		N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			c = 0;
			a = scan.next();
			b = scan.next();
			for (int j = 0; j < a.length(); j++) {
				for (int k = 0; k < a.length(); k++) {
					if (a.charAt(j) == b.charAt(k)) {
						c++;
						break;
					}
				}
			}
			if (c == a.length()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

		scan.close();
	}

}
