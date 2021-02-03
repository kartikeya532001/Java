package HackerEarth;

import java.util.Scanner;

public class PrinttheNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();
		int b[] = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.print(b[i] + " ");
		}
		scan.close();
	}

}
