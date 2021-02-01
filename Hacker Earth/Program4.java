package HackerEarth;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		int In, T, Cg, Cp, one, two;
		int a[] = new int[2];
		Scanner scan = new Scanner(System.in);
		In = scan.nextInt();

		for (int k = 0; k < In; k++) {

			Cg = scan.nextInt();
			Cp = scan.nextInt();
			T = scan.nextInt();
			one = 0;
			two = 0;
			for (int i = 0; i < T; i++) {
				for (int j = 0; j < 2; j++) {
					a[j] = scan.nextInt();
				}
				if (a[0] == 1)
					one += 1;
				if (a[1] == 1)
					two += 1;
			}
			int oneCg = one * Cg;
			int twoCp = two * Cp;
			int oneCp = one * Cp;
			int twoCg = two * Cg;
			int Op = Math.min(oneCg + twoCp, twoCg + oneCp);
			System.out.println(Op);
		}
	}

}
