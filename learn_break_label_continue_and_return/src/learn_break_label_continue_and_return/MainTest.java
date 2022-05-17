package learn_break_label_continue_and_return;

public class MainTest {

	public static void main(String[] args) {	
		int i, j = 0;
		System.out.println("Sử dụng break");
		for ( i = 0; i < 10; i++) {
			for ( j = 0; j < 20; j++) {
				if(j > 10) {
					break;
				}
			}
			System.out.println("Vòng lặp j = " + j + ", i = " + i);
		}
		System.out.println("Vòng lặp j = " + j + ", i = " + i);
		System.out.println();
		
		System.out.println("-----------------------");
		System.out.println("Sử dụng label cùng với break");
		int m, n = 0;
		outer: for ( m = 0; m < 10; m++) {
			for ( n = 0; n < 20; n++) {
				if(n > 10) {
					break outer;
				}
			}
			System.out.println("Vòng lặp m = " + m + ", n = " + n);
		}
		System.out.println("Vòng lặp m = " + m + ", n = " + n);
		System.out.println();
		
		System.out.println("-----------------------");
		System.out.println("Sử dụng continue");
		//Continue được sử dụng để tiếp tục vòng lặp tại điều kiện đã được xác định
		//Với điều kiện đó thì câu lệnh phía sau continue sẽ không được thực thi
		//với vòng lặp bên trong một vòng lặp thì nó chỉ có tác dụng vòng lặp trong của nó, hiểu nôm na là nó lằm ở vòng lặp nào thì có tác dụng với còng lặp đó
		int max = 100;
		for (int k = 0; k < max; k++) {
			if(k < 50) {
				continue;
			}
			System.out.print(k + " ");
		}
		System.out.println();
		
		System.out.println("-----------------------");
		System.out.println("Sử dụng continue với label tính bảng cửu chương");
		outer: for (int k = 2; k < 9; k++) {
				for (int k2 = 1; k2 <= 10; k2++) {
					if(k2 > 2) {
						continue outer;
					}
					System.out.println(k + " x " + k2 + " = " + (k*k2));
				}
				System.out.println();
		}
		
		System.out.println();
		
		System.out.println("-----------------------");
		System.out.println("Sử dụng return");
		for (int k = 2; k < 9; k++) {
			for (int k2 = 1; k2 <= 10; k2++) {
				if(k2 > 5) {
					return;//sử dụng return ở đây là khi nó không thỏa mãn điều kiện thì nó sẽ ngưng luôn chương trình, ngưng luôn method đó, ngưng luôn đoạn code sau nó luôn 
				}
				System.out.println(k + " x " + k2 + " = " + (k*k2));
			}
			System.out.println();
		}
		
		
	}
}
