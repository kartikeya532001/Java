package HackerRank;

import java.util.Scanner;

public class Program6 {

	static int series(int f, int h, int j) {
		int sum = f;
		for (int i = 0; i <= j; i++) {
			sum = sum + ((int) Math.pow(2, i)) * h;
		}
		return sum;

	}

	public static void main(String[] args) {

		int a, b, c, d;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		for (int i = 0; i < a; i++) {
			b = scan.nextInt();
			c = scan.nextInt();
			d = scan.nextInt();
			for (int j = 0; j < d; j++) {
				// series(b, c, d);
				System.out.print(series(b, c, j) + " ");
			}
			System.out.println();

		}
	}

}
