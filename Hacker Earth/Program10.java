package HackerEarth;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;

		String a = scan.nextLine();
		int[] b = new int[a.length()];
		for (int i = 0; i < a.length(); i++) {

			b[i] = (int) a.charAt(i) - 96;

			sum = sum + b[i];

		}
		System.out.println(sum);
		scan.close();
	}
}
