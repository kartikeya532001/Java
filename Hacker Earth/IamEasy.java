package HackerEarth;

import java.util.Scanner;

public class IamEasy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i;
		i = scan.nextInt();
		for (int j = 1; j <= 10; j++) {
			System.out.println(i * j);
		}

		scan.close();
	}

}
