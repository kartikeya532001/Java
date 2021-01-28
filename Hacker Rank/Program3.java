package HackerRank;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		a = scan.nextInt();
		if (a % 2 != 0)
			System.out.println("Weird");
		else if (a < 6 && a > 1)
			System.out.println("Not Weird");
		else if (a < 21 && a > 5)
			System.out.println("Weird");
		else
			System.out.println("Not Weird");

	}

}
