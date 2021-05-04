package HackerRank;

import java.util.Scanner;

public class JavaOutputFormatting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s = scan.next();
			int a = scan.nextInt();
			System.out.printf("%-15s%03d %n", s, a);
		}
		System.out.println("================================");
		scan.close();
	}

}
