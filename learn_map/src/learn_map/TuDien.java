package learn_map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TuDien {
	
	private Map<String, String> data = new TreeMap<String, String>();
	//Thêm từ
	public String themTu(String tuKhoa, String yNghia) {
		return this.data.put(tuKhoa, yNghia);
	}
	//Xóa từ khóa
	public String remove(String tuKhoa) {
		return this.data.remove(tuKhoa);
	}
	//Tra từ khóa
	public String traTu(String tuKhoa) {
		String yNghia = this.data.get(tuKhoa);
		return yNghia;
	}
	//In ra từ khóa
	public void inTuKhoa() {
		Set<String> tapHopTuKhoa = this.data.keySet();
		System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
	}
	//So lượng từ khóa
	public int soLuongTuKhoa() {
		return this.data.size();
	}
	//Xóa tất cả từ khóa
	public void xoaAll() {
		this.data.clear();
	}
	
	public static void main(String[] args) {
		
		TuDien tuDien = new TuDien();
		
		Scanner scanner = new Scanner(System.in);
		
		int luaChon = 0;
		
		do {
			System.out.println("\n-----------------------");
			System.out.println("Menu");
			System.out.println("1. Thêm từ(Từ khóa, Ý nghĩa)\r\n"
					+ "2. Xóa từ\r\n"
					+ "3. Tìm ý nghĩa của từ khóa -> Tra từ\r\n"
					+ "4. In ra danh sách từ khóa\r\n"
					+ "5. In ra số lượng từ.\r\n"
					+ "6. Xóa tất cả các từ khóa");
			luaChon = scanner.nextInt();
			scanner.nextLine();
			if(luaChon == 1) {
				System.out.print("Nhập vào từ khóa: ");
				String tuKhoa = scanner.nextLine();
				
				System.out.print("Nhập vào ý nghĩa của từ khóa: ");
				String yNghia = scanner.nextLine();
				
				tuDien.themTu(tuKhoa, yNghia);
			}
			if(luaChon == 3) {
				System.out.print("Nhập vào từ khóa cần tìm: ");
				String key = scanner.nextLine();
				System.out.print("Ý nghĩa là: " + tuDien.traTu(key));
			}
			if(luaChon == 4) {
				System.out.println("Danh sách từ khóa: ");
				tuDien.inTuKhoa();
			}
			
		} while (luaChon != 0);
		
//		Map myMap = new HashMap();
//		
//		myMap.put(1, "Amit");
//		myMap.put(2, "Rahul");
//		myMap.put(3, "Jai");
//		myMap.put(4, "Amit");
//		
//		//Traversing Map
//		Set mySet = myMap.entrySet();//Chuyển đổi thành Set để có thể duyệt
//		
//		Iterator itr = mySet.iterator();
//		
//		while (itr.hasNext()) {
//			Map.Entry entry = (Map.Entry)itr.next();
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
		
		
	}

}
