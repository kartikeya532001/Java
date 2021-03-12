import java.util.Scanner;

import collegework.Package1;
import collegework.Package2;
import collegework.Package3;
import collegework.Package4;
import collegework.Package5;
import collegework.Package6;

public class Calc {

	public static void main(String[] args) {
		int x, y;
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		System.out.println("Sum: " + (new Package1()).add(x, y));
		System.out.println("Sub: " + (new Package2()).sub(x, y));
		System.out.println("Pro: " + (new Package3()).mul(x, y));
		System.out.println("Div: " + (new Package4()).div(x, y));
		System.out.println("Rem: " + (new Package6()).rem(x, y));
		System.out.println();
		System.out.println("Table of " + x);
		for (int i = 1; i <= 10; i++) {
			System.out.println(x + "*" + i + "=" + (new Package5()).table(x, i));
		}
		System.out.println();
		System.out.println("Table of " + y);
		for (int i = 1; i <= 10; i++) {
			System.out.println(y + "*" + i + "=" + (new Package5()).table(y, i));
		}
		scan.close();
	}

}
