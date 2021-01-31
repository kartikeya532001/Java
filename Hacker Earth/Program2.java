package HackerEarth;

import java.util.Scanner;

class Recursion {

	int fact(int n) {
		int result;
		if (n == 1)
			return 1;
		else
			result = fact(n - 1) * n;
		return result;
	}
}

public class Program2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		Recursion obj = new Recursion();
		System.out.println(obj.fact(a));
	}

}
