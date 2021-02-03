package HackerEarth;

import java.util.Scanner;

public class TeddyandTweety {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();
		if (n % 3 == 0)
			System.out.println("YES");
		else
			System.out.println("NO");

		scan.close();
	}

}
