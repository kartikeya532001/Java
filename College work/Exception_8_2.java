package collegework;

import java.util.Scanner;

public class Exception_8_2 {
	public static void main(String arg[]) {
		Scanner scan = new Scanner(System.in);
		int d[] = new int[10];
		System.out.println("Enter values of following variables : ");
		System.out.print("a : ");
		int a = scan.nextInt();
		System.out.print("b : ");
		int b = scan.nextInt();
		System.out.print("c : ");
		int c = scan.nextInt();
		try {
			double ans = (a + b) / c;
			System.out.println("Value : " + ans);
			try {
				System.out.println("Enter values in an array : ");
				for (int i = 0; i < 20; i++) {
					d[i] = scan.nextInt();
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("An exception is occured in the nested try block due to array index out of bound");
			}
		} catch (ArithmeticException e) {
			System.out.println("An exception is occured due to division by 0 so dont put value of c to 0");
		}
		scan.close();
	}
}
