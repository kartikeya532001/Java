package collegework;

import java.util.Scanner;

public class Exception_8_1 {
	public static void main(String arg[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of test cases:");
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.println("Enter the three numbers a,b and c.");
			System.out.print("a: ");
			int a = scan.nextInt();
			System.out.print("b: ");
			int b = scan.nextInt();
			System.out.print("c: ");
			int c = scan.nextInt();
			try {
				int ans = (a + b) / c;
				System.out.println("Value : " + ans);
			} catch (ArithmeticException e) {
				System.out.println(
						"Division by 0 has caused has caused this exception so please dont put value of c to 0");
			} finally {
				System.out.println("This block will run even after the exception is thrown in the catch block");
			}
		}
		scan.close();
	}

}
