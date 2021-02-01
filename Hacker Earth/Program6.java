package HackerEarth;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a;
		int z = 0;
		a = scan.next();
		for (int i = 0; i < a.length() / 2; i++) {
			if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
				z++;
			}
		}
		if (z == 0) {
			System.out.println("YES");
		} else
			System.out.println("NO");
		scan.close();
	}

}
