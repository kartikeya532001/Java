package HackerEarth;

import java.util.Scanner;

public class Life {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 1;
		while (a != 42) {
			a = scan.nextInt();
			if (a != 42)
				System.out.println(a);
		}
		scan.close();
	}
}
