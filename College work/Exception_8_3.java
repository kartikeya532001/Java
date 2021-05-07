package collegework;

import java.util.Scanner;

public class Exception_8_3 {
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
		} finally {
			System.out.println();
			System.out.println(
					"Since an exception occured earlier so we are now going to insert values in an array with the help of finally block : ");
			for (int i = 0; i < 10; i++) {
				d[i] = scan.nextInt();
			}
			System.out.println();
			System.out.println("Entered values in an array are as follows : ");
			for (int i = 0; i < 10; i++) {
				System.out.println(d[i]);
			}
		}
		scan.close();
	}
}