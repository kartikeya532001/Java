package HackerEarth;

import java.util.Scanner;

public class Ali {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();

		if ((str.charAt(2) != 'A' && str.charAt(2) != 'E' && str.charAt(2) != 'I' && str.charAt(2) != 'O'
				&& str.charAt(2) != 'U' && str.charAt(2) != 'Y') && ((str.charAt(7) + str.charAt(8)) % 2 == 0)
				&& ((str.charAt(3) + str.charAt(4)) % 2 == 0) && ((str.charAt(4) + str.charAt(5)) % 2 == 0)
				&& ((str.charAt(0) + str.charAt(1)) % 2 == 0)) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}

		scan.close();
	}

}
