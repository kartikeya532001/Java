package collegework;

public class CLM {
	public static void main(String args[]) {

		int r1, c1, r2, c2, i, j, k, z;
		z = 4;

		System.out.println("Enter the no of rows in 1st matrix: ");
		r1 = Integer.parseInt(args[0]);
		System.out.println("Enter the no of coloumns in 1st matrix: ");
		c1 = Integer.parseInt(args[1]);
		int a[][] = new int[r1][c1];
		System.out.println("Enter the elements of the 1st matrix: ");
		for (i = 0; i < r1; i++) {
			for (j = 0; j < c1; j++) {
				a[i][j] = Integer.parseInt(args[z]);
				z++;
			}
		}

		System.out.println("Enter the no of rows in 2nd matrix: ");
		r2 = Integer.parseInt(args[2]);
		System.out.println("Enter the no of coloumns in 2nd matrix: ");
		c2 = Integer.parseInt(args[3]);
		int b[][] = new int[r2][c2];
		System.out.println("Enter the elements of the 1st matrix: ");
		for (i = 0; i < r2; i++) {
			for (j = 0; j < c2; j++) {
				b[i][j] = Integer.parseInt(args[z]);
				z++;
			}
		}
		System.out.println("Matrix is 1: ");
		for (i = 0; i < r1; i++) {
			for (j = 0; j < c1; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Matrix is 2: ");
		for (i = 0; i < r2; i++) {
			for (j = 0; j < c2; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		if (c1 == r2) {
			int c[][] = new int[r1][c2];
			for (i = 0; i < r1; i++) {
				for (j = 0; j < c2; j++) {
					c[i][j] = 0;
				}

			}
			for (i = 0; i < r1; i++) {
				for (j = 0; j < c2; j++) {
					for (k = 0; k < c1; k++) {
						c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
					}
				}
			}

			System.out.println("Matrix after multiplication is: ");
			for (i = 0; i < r1; i++) {
				for (j = 0; j < c2; j++) {
					System.out.print(c[i][j] + " ");
				}
				System.out.println();
			}
		} else {
			System.out.println("Martix multiplication is not possible. ");

		}
	}
}
