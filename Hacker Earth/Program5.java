package HackerEarth;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		long b = 1;
		a = scan.nextInt();
		int c[] = new int[a];
		for (int i = 0; i < a; i++) {
			c[i] = scan.nextInt();
		}
		for (int i = 0; i < a; i++) {
			b = (b * c[i]) % (1000000007);
		}
		System.out.println(b);
		scan.close();
	}

}
