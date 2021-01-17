package collegework;

public class Prime {
	public static void main(String args[]) {
		for (int i = 2; i <= 1000; i++) {
			int h = 0;
			for (int k = 2; k < i / 2; k++) {
				if (i % k == 0) {
					h++;
					break;
				}
			}
			if (h == 0)
				System.out.println(i + "");
		}
	}
}
