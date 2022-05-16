package main;

import java.util.Scanner;

public class MainTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào một chuỗi: ");
		String string = scanner.nextLine();
		
		char[] arr = string.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char c = (char)arr[i];
			int index = (int)c;
			System.out.print(index + " ");
		}
		
	}

}
