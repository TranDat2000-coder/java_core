package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MyTest {
	
	private static Iterator func(ArrayList myList) {
		Iterator it = myList.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			if(element instanceof String) {
				break;
			}
		}
		return it;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList myList = new ArrayList();
		System.out.println("Nhập các phần tử trước ###");
		int n = scanner.nextInt();
		System.out.println("Nhập các phần tử sau ###");
		int m = scanner.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Nhập value trước ###");
			myList.add(scanner.nextInt());
		}
		
		myList.add("###");
		for (int i = 0; i < m; i++) {
			System.out.println("Nhập value sau ###");
			myList.add(scanner.next());
		}
		
		Iterator it = func(myList);
//		Iterator it = myList.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			System.out.println((String)element);
		}
	}
}
