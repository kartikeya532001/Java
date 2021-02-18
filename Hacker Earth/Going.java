package HackerEarth;

import java.util.Scanner;

public class Going {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long d, oc, of, od, cs, cb, cm, cd, ot, ct;
		d = scan.nextInt();
		oc = scan.nextInt();
		of = scan.nextInt();
		od = scan.nextInt();
		cs = scan.nextInt();
		cb = scan.nextInt();
		cm = scan.nextInt();
		cd = scan.nextInt();
		ot = oc + (d - of) * od;
		ct = cb + (d / cs) * cm + d * cd;
		if (ot <= ct) {
			System.out.println("Online Taxi");
		} else {
			System.out.println("Classic Taxi");
		}

		scan.close();
	}

}
