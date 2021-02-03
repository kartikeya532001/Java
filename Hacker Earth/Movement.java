package HackerEarth;

import java.util.Scanner;

public class Movement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, s = 0;
		n = scan.nextInt();
		while (n > 5) {
			s++;
			n = n - 5;
		}
		if (n == 0) {
			System.out.println(s);
		} else {
			System.out.println(s + 1);
		}
		scan.close();
	}

}
