package collegework;

import java.util.Scanner;

abstract class StuMarks {
	int phy, chem, maths;

	StuMarks(int a, int b, int c) {
		phy = a;
		chem = b;
		maths = c;
	}

	abstract double avg();
}

class Science extends StuMarks {

	Science(int a, int b, int c) {
		super(a, b, c);
	}

	double avg() {
		double avg = (phy + maths + chem) / 3;
		return avg;
	}
}

public class Abstract_5_1 {
	public static void main(String arg[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks of physics,chemistry and maths.");
		System.out.print("Physics : ");
		int d = scan.nextInt();
		System.out.print("Chemistry : ");
		int e = scan.nextInt();
		System.out.print("Maths : ");
		int f = scan.nextInt();
		Science s1 = new Science(d, e, f);
		StuMarks s2;
		s2 = s1;
		System.out.println("Average score is " + s2.avg());

		scan.close();
	}
}
