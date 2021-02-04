package HackerEarth;

import java.util.Scanner;

public class Gokiandhisbreakup {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, sr, sa;
		n = scan.nextInt();
		sr = scan.nextInt();
		for (int i = 0; i < n; i++) {
			sa = scan.nextInt();
			if (sa >= sr)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

		scan.close();
	}

}
