package HackerEarth;

import java.util.Scanner;

public class DoctorSecret {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		if (a <= 23 && b <= 1000 && b >= 500) {
			System.out.println("Take Medicine");
		} else {
			System.out.println("Don't take Medicine");
		}

		scan.close();
	}

}
