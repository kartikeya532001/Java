package HackerEarth;

import java.util.Scanner;

public class BricksGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N, p = 1, m = 2;
		N = scan.nextInt();
		while (N != 0) {
			N = N - p;
			if (N <= 0) {
				System.out.println("Patlu");
				break;
			}
			N = N - m;
			if (N <= 0) {
				System.out.println("Motu");
				break;
			}
			p++;
			m = p * 2;
		}

		scan.close();
	}

}
