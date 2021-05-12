package HackerRank;

import java.util.*;

class Difference {
	private int[] elements;
	public int maximumDifference;

	Difference(int[] b) {
		this.elements = b;
	}

	void computeDifference() {
		int max = Arrays.stream(elements).max().getAsInt();
		int min = Arrays.stream(elements).min().getAsInt();
		maximumDifference = max - min;
	}
}

public class Day14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Difference difference = new Difference(a);
		difference.computeDifference();
		System.out.print(difference.maximumDifference);
		sc.close();
	}
}
