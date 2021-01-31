package HackerEarth;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int k = 0, j = 0;

		String a = scan.next();

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'z')
				k++;
			else if (a.charAt(i) == 'o')
				j++;
		}

		if (2 * k == j)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
