package HackerEarth;

public class Program7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c, j = 0;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		for (int i = a; i <= b; i++) {
			if (i % c == 0) {
				j++;
			}
		}
		System.out.println(j);
		scan.close();

	}

}
