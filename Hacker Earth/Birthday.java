package HackerEarth;

import java.util.Scanner;

public class Birthday {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, f, c;
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			f = scan.nextInt();
			c = scan.nextInt();
			if (c % f == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

		scan.close();
	}

}
