package HackerEarth;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		int Nc, Sn, Os;
		Scanner scan = new Scanner(System.in);
		Nc = scan.nextInt();
		for (int i = 0; i < Nc; i++) {
			Sn = scan.nextInt();
			if (Sn % 12 == 1 || Sn % 12 == 0) {
				if (Sn % 12 == 0) {
					Os = Sn - 11;
					System.out.println(Os + " WS");
				} else {
					Os = Sn + 11;
					System.out.println(Os + " WS");
				}
			} else if (Sn % 12 == 6 || Sn % 12 == 7) {
				if (Sn % 12 == 6) {
					Os = Sn + 1;
					System.out.println(Os + " WS");
				} else {
					Os = Sn - 1;
					System.out.println(Os + " WS");
				}
			} else if (Sn % 12 == 2 || Sn % 12 == 11) {
				if (Sn % 12 == 2) {
					Os = Sn + 9;
					System.out.println(Os + " MS");
				} else {
					Os = Sn - 9;
					System.out.println(Os + " MS");
				}
			} else if (Sn % 12 == 5 || Sn % 12 == 8) {
				if (Sn % 12 == 5) {
					Os = Sn + 3;
					System.out.println(Os + " MS");
				} else {
					Os = Sn - 3;
					System.out.println(Os + " MS");
				}
			} else if (Sn % 12 == 3 || Sn % 12 == 10) {
				if (Sn % 12 == 3) {
					Os = Sn + 7;
					System.out.println(Os + " AS");
				} else {
					Os = Sn - 7;
					System.out.println(Os + " AS");
				}
			} else {
				if (Sn % 12 == 4) {
					Os = Sn + 5;
					System.out.println(Os + " AS");
				} else {
					Os = Sn - 5;
					System.out.println(Os + " AS");
				}
			}
		}
	}

}
