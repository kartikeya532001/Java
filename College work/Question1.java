package collegework;

import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input: ");
		String str = scan.nextLine();
		Map<String, Integer> sarr = new TreeMap<>();
		String arr[] = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (sarr.containsKey(arr[i])) {
				sarr.put(arr[i], sarr.get(arr[i]) + 1);
			} else {
				sarr.put(arr[i], 1);
			}
		}
		for (Map.Entry<String, Integer> frequency : sarr.entrySet()) {
			System.out.println(frequency.getKey() + " - " + frequency.getValue());
		}
		scan.close();
	}
}
