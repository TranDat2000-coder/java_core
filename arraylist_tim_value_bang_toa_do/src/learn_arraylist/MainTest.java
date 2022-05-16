package learn_arraylist;

import java.util.*;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// System.out.print("Enter line number: ");
		// ArrayList[] lists = new ArrayList[20];
		// int n = scanner.nextInt();

		// // Enter number of line
		// for (int i = 1; i <= n; i++) {
		// lists[i] = new ArrayList();
		// int x = scanner.nextInt();

		// for (int j = 1; j <= x; j++) {
		// // Enter value
		// System.out.print("Enter value: ");
		// int value = scanner.nextInt();
		// lists[i].add(value);
		// }
		// }

		// int q = scanner.nextInt();

		// for (int i = 1; i <= q; i++) {
		// int x, y;
		// x = scanner.nextInt();
		// y = scanner.nextInt();
		// try {
		// System.out.println("Value: " + lists[x].get(y));
		// } catch (Exception e) {
		// System.out.println("ERROR!");
		// }
		// }

		List<Integer> listint = new ArrayList<>();
		System.out.print("Enter line number: ");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			listint.add(n);
			// System.out.print("Enter the number of values: ");
			// int m = scanner.nextInt();

		}
	}

}
