package learn_ternary_operator;

import java.util.Scanner;

public class MyMain {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập vào một số: ");
		int a = scanner.nextInt();
		
		String result = (a % 2 == 0)? "số chẵn" : "số lẻ";
		
		System.out.println(a + " là " + result);
	}

}
