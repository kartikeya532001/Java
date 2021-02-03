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

			for (int i = 1; i <= n; i++) {
				for (int k = i-1; k < i; k++) {
					if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o'
							|| a.charAt(i) == 'u') {
						if (a.charAt(k) != 'a' && a.charAt(k) != 'e' && a.charAt(k) != 'i' && a.charAt(k) != 'o'
								&& a.charAt(k) != 'u') {
							s++;
						}
					}
				}
			}
			System.out.println(s);
		}
		scan.close();
	}
}
