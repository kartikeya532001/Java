package HackerRank;

import java.util.Scanner;

public class Day2 {
	static void solve(double meal_cost, int tip_percent, int tax_percent) {
		double a = (meal_cost * tip_percent) / 100;
		double b = (meal_cost * tax_percent) / 100;
		double c = (a + b + meal_cost);
		int d = (int) c;
		if ((c - d) < 0.5)
			System.out.println(d);
		else
			System.out.println(d + 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double meal_cost = scanner.nextDouble();
		int tip_percent = scanner.nextInt();
		int tax_percent = scanner.nextInt();
		solve(meal_cost, tip_percent, tax_percent);
		scanner.close();
	}
}
