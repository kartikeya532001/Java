package Class;

import java.util.*;

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

public class Program8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, c;
		System.out.println("Enter the number whose factorial is to be calculated: ");
		a = scan.nextInt();
		Recursion obj = new Recursion();
		c = obj.fact(a);
		System.out.println("The factorial of " + a + " is: " + c);
	}

}
