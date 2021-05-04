package HackerRank;

import java.util.Scanner;

public class LetReview {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			String S = scan.next();
			char[] a = S.toCharArray();
			for (int j = 0; j < S.length(); j++) {
				if (j % 2 == 0) {
					System.out.print(a[j]);
				}
			}
			System.out.print("  ");
			for (int j = 0; j < S.length(); j++) {
				if (j % 2 != 0) {
					System.out.print(a[j]);
				}
			}
			System.out.println("");
		}
		scan.close();
	}

}
