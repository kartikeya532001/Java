package collegework;

import java.util.Scanner;

public class BRM3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;
		String s1;
		int i = 0;
		s = scan.nextLine();
		s1 = s.substring(0, 2);
		String s3 = s.substring(2, 8);
		if (s.charAt(8) == 'P') {
			if (s.charAt(0) == '1' && s.charAt(1) == '2') {
				System.out.println(s1 + s3);
				if (s.charAt(8) == 'A') {
					if (s.charAt(0) == '1' && s.charAt(1) == '2') {
						System.out.println("00" + s3);
					}
				}
			} else {
				i = Integer.parseInt(s1);
				i += 12;
				String s2 = String.valueOf(i);
				System.out.println(s2 + s3);
			}
		}
		if (s.charAt(8) == 'A') {
			if (s.charAt(0) == '1' && s.charAt(1) == '2') {
				System.out.println("00" + s3);
			} else {
				System.out.println(s1 + s3);
			}
		}
		scan.close();
	}

}
