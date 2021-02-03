package HackerEarth;

import java.util.Scanner;

public class BacktoSchool {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		if (a > c && a > b) {
			System.out.println(a);
		} else if (b > a && b > c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
		scan.close();
	}
}
