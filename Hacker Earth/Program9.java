package HackerEarth;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;
		char a;
		s = scan.next();
		for (int i = 0; i < s.length(); i++) {
			a = s.charAt(i);
			if (a >= 'a' && a <= 'z') {
				System.out.print(Character.toUpperCase(a));
			}
			if (a >= 'A' && a <= 'Z') {
				System.out.print(Character.toLowerCase(a));
			}
		}

		scan.close();
	}

}
