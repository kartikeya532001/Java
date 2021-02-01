package HackerEarth;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int l, n, w, h;
		l = scan.nextInt();
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			w = scan.nextInt();
			h = scan.nextInt();
			if (w < l || h < l) {
				System.out.println("UPLOAD ANOTHER");
			} else {
				if (w == h) {
					System.out.println("ACCEPTED");
				} else {
					System.out.println("CROP IT");
				}
			}
		}
		scan.close();
	}

}
