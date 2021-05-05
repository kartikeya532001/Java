package HackerRank;

import java.util.Scanner;

public class Day7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		while (n > 0) {
			n--;
			System.out.print(a[n] + " ");

		}
		scan.close();
	}

}
