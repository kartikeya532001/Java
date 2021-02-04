package HackerEarth;

import java.util.Scanner;

public class BookofPotionmaking {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a, b, sum = 0, j = 10;
		a = scan.nextLong();
		while (a > 10) {
			b = a % 10;
			a = a / 10;
			sum = sum + (b * j);
			j--;

		}
		sum = sum + a;
		if (sum % 11 == 0)
			System.out.println("Legal ISBN");
		else
			System.out.println("Illegal ISBN");
		scan.close();
	}

}
