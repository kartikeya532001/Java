package HackerRank;

import java.util.Scanner;

public class JavaStatic {
	static int H, B;
	static boolean flag = false;
	static {
		Scanner scan = new Scanner(System.in);
		H = scan.nextInt();
		B = scan.nextInt();
		if (H > 0 && B > 0) {
			flag = true;
		} else
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		scan.close();
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

}
