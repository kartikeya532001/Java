package HackerEarth;

import java.util.Scanner;

public class Ladderophilia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();
		System.out.println("*" + "   " + "*");
		System.out.println("*" + "   " + "*");
		for (int i = 0; i < n; i++) {
			System.out.println("*****");
			System.out.println("*" + "   " + "*");
			System.out.println("*" + "   " + "*");
		}

		scan.close();
	}

}
