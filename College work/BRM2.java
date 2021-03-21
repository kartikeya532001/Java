package collegework;

import java.util.Scanner;

public class BRM2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long sum = 0, max = 0, min = 0;

		long[] a = new long[5];
		for (int i = 0; i < 5; i++) {
			a[i] = scan.nextLong();
			sum = sum + a[i];
		}

		max = a[0];
		min = a[0];
		for (int i = 0; i < 5; i++) {
			if (a[i] > max)
				max = a[i];
			if (a[i] <= min)
				min = a[i];
		}
		long summax = sum - min;
		long summin = sum - max;
		System.out.println(summin + " " + summax);
		scan.close();
	}

}
