package HackerEarth;

import java.util.Scanner;

public class Emazein {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int l = 0, r = 0, up = 0, dw = 0;
		String a;
		a = scan.nextLine();
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'L') {
				l--;
			} else if (a.charAt(i) == 'R') {
				r++;
			} else if (a.charAt(i) == 'U') {
				up++;
			} else if (a.charAt(i) == 'D') {
				dw--;
			}
		}

		System.out.println((l + r) + " " + (up + dw));
		scan.close();
	}

}
