package main;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MyTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Map<String, Integer> data = new TreeMap<String, Integer>();
		
		System.out.print("Nhập số lượng danh bạ cần thêm: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập tên: ");
			String name = scanner.nextLine();
			System.out.print("Nhập số điện thoại: ");
			int numberPhone = scanner.nextInt();
			data.put(name, numberPhone);
			scanner.nextLine();
		}
		
		//Use Iterator loop to display all data
		System.out.println("Danh sách danh bạ");
		Set mySet = data.entrySet();
		Iterator itr = mySet.iterator();
		while (itr.hasNext()) {
			Object element = (Object) itr.next();
			System.out.println(element);
		}
		
		while (scanner.hasNext()) {
			System.out.print("Nhập tên tìm kiếm: ");
			String name = scanner.next();
			try {
				int phone = data.get(name);
				System.out.println(name + " = " + phone);
			} catch (Exception e) {
				System.out.println("Not found");
			}
			
		}
	}

}
