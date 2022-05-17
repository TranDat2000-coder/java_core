package main;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập số cần chuyển đổi: ");
		int n = scanner.nextInt();
		
		//Tạo một string rỗng
		//Lấy số nguyên chia cho 2 lấy dư
		String binary = "";
		while (n > 0) {
			binary = (n % 2) + binary;
			n = n / 2;
		}
		System.out.println("Hệ nhị phân là: " + binary);
	}
}
