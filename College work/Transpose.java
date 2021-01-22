package collegework;

import java.util.*;

public class Transpose {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int r, c, i, j;
		System.out.println("Enter the no of rows: ");
		r = scan.nextInt();
		System.out.println("Enter the no of coloumns: ");
		c = scan.nextInt();
		int a[][] = new int[r][c];
		System.out.println("Enter the elements of the matrix: ");
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		System.out.println("Matrix is: ");
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Transpose of the matrix is: ");
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
	}
}
