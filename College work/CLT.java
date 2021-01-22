package collegework;

public class CLT {
	public static void main(String args[]) {

		int r, c, i, j, k;
		k = 2;
		System.out.println("Enter the no of rows: ");
		r = Integer.parseInt(args[0]);
		System.out.println("Enter the no of coloumns: ");
		c = Integer.parseInt(args[1]);
		int a[][] = new int[r][c];
		System.out.println("Enter the elements of the matrix: ");
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				a[i][j] = Integer.parseInt(args[k]);
				k++;
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
