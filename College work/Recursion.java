package collegework;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("Enter the value of N for the series is required to be printed: ");
		n = scan.nextInt();
		if (n <= 0) {
			System.out.println("Invalid Value.");
		} else {
			System.out.print("Series is as follows:  ");
			for (int i = 0; i < n; i++) {
				System.out.print(fab(i) + "  ");
			}
		}
		scan.close();
	}

	static int fab(int a) {
		if (a <= 1) {
			return a;
		} else {
			return (fab(a - 1) + fab(a - 2));
		}
	}

}
