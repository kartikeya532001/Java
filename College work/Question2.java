package collegework;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input: ");
		String S = scan.nextLine();
		char[] a = S.toCharArray();
		for (int i = 0; i < S.length(); i++) {
			if (i == 0 && a[i] != ' ' || a[i] != ' ' && a[i - 1] == ' ') {
				a[i] = Character.toUpperCase(a[i]);

			}
		}
		String Output = new String(a);
		System.out.println("Output: " + Output);
		scan.close();
	}

}
