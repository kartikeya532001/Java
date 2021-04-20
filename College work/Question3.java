package collegework;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;
		int t;
		System.out.print("Enter the no of test Cases: ");
		t = scan.nextInt();
		for (int j = 0; j < t; j++) {
			int ev;
			System.out.println();
			System.out.print("Input String: ");
			s = scan.next();
			System.out.print("Encoding Value: ");
			ev = scan.nextInt();
			int z;
			System.out.print("Output: ");
			for (int i = 0; i < s.length(); i++) {
				z = 0;
				z = ev + (int) s.charAt(i);
				if (z > 122) {
					int k = z - 122;
					z = k + 96;
				}
				char y = (char) z;
				System.out.print(y);
			}
		}

		scan.close();
	}

}
