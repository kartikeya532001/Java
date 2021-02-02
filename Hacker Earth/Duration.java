package HackerEarth;

import java.util.Scanner;

public class Duration {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, sh, sm, eh, em, hl, ml;
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			sh = scan.nextInt();
			sm = scan.nextInt();
			eh = scan.nextInt();
			em = scan.nextInt();
			hl = eh - sh;
			ml = em - sm;
			if (ml < 0) {
				hl = hl - 1;
				ml = ml + 60;
				System.out.println(hl + " " + ml);
			} else
				System.out.println(hl + " " + ml);
		}
		scan.close();

	}

}
