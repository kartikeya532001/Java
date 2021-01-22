package collegework;

import java.util.*;

public class Inverse {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int  i, j;
		int a[][] = new int[2][2];
		System.out.println("Enter the elements of the matrix: ");
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		System.out.println("Matrix is: ");
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
int det;
det= (a[0][0]*a[1][1])-(a[1][0]*a[0][1]);
double in[][]= new double[2][2];
in[0][0]=a[1][1];
in[1][1]=a[0][0];
in[0][1]=-a[0][1];
in[1][0]=-a[1][0];
System.out.println("Determinant is: " +det);

for (i = 0; i < 2; i++) {
	for (j = 0; j < 2; j++) {
		in[i][j]=in[i][j]/det;
	}
	
}
System.out.println("Inverse matrix is: ");
for (i = 0; i < 2; i++) {
	for (j = 0; j < 2; j++) {
		System.out.print(in[i][j] + " ");
	}
	System.out.println();
}
	}
}
