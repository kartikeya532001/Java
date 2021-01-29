package HackerRank;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i;
		i = scan.nextInt();
		for (int j = 1; j <= 10; j++) {
			System.out.println(i + "*" + j + "=" + (i * j));
		}

	}

}
