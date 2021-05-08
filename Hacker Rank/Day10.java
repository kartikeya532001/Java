package HackerRank;

import java.util.Scanner;

public class Day10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String b = Integer.toBinaryString(a);
		int op = 0;
		int count = 0;
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == '1') {
				count++;
				if (count > op)
					op = count;
			} else {
				count = 0;
			}
		}
		System.out.println(op);
		scan.close();
	}

}
