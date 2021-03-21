package collegework;

import java.util.Scanner;

public class BRM1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, sum = 0;
		n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			sum = sum + a[i];
		}
		System.out.println(sum);
		scan.close();
	}

}
