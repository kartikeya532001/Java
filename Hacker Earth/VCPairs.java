package HackerEarth;

import java.util.Scanner;

public class VCPairs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, t, s;
		String a;
		t = scan.nextInt();
		for (int j = 0; j < t; j++) {
			s = 0;
			n = scan.nextInt();
			a = scan.next();

			for (int i = 0; i < n - 1; i++) {

				if ((a.charAt(i + 1) == 'a' || a.charAt(i + 1) == 'e' || a.charAt(i + 1) == 'i'
						|| a.charAt(i + 1) == 'o' || a.charAt(i + 1) == 'u')
						&& (a.charAt(i) != 'a' && a.charAt(i) != 'e' && a.charAt(i) != 'i' && a.charAt(i) != 'o'
								&& a.charAt(i) != 'u')) {
					s++;
				}

			}

			System.out.println(s);
		}
		scan.close();
	}
}
