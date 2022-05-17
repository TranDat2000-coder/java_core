package learn_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MyIterator {
	
	public static void main(String[] args) {
		
		ArrayList lisLanguages = new ArrayList<String>();
		
		lisLanguages.add("Java");
		lisLanguages.add("Python");
		lisLanguages.add("PHP");
		lisLanguages.add(".NET");
		lisLanguages.add("C");
		lisLanguages.add("C++");
		
		//Sử dụng Iterator để hiển thị nội dung của lisLanguages
		System.out.println("Danh sách ngôn ngữ lập trình");
		Iterator itr = lisLanguages.iterator();
		while (itr.hasNext()) {
			Object elmentObject = itr.next();
			System.out.println(elmentObject);
		}
		
		System.out.println();
		
		//Sửa các phần tử được lặp
		ListIterator list = lisLanguages.listIterator();
		while (list.hasNext()) {
			Object element = list.next();
			list.set(element + " (Pass)");
		}
		
		System.out.println("Nội dung đã được sửa của listLanguages");
		itr = lisLanguages.iterator();
		while (itr.hasNext()) {
			Object element = itr.next();
			System.out.println(element);
		}
		
		System.out.println();
		
		System.out.println("Đảo ngược nội dung của listLanguages");
		while (list.hasPrevious()) {
			Object element = list.previous();
			System.out.println(element);
		}
		
		System.out.println();
		
		System.out.println("Xóa phần tử ");
		list = lisLanguages.listIterator();
		while (list.hasNext()) {
			Object element = list.next();
			if("C (Pass)".equals(element.toString())) {
				list.remove();
			}
		}
		
		System.out.println("Nội dung đã được sửa khi xóa của listLanguages");
		itr = lisLanguages.iterator();
		while (itr.hasNext()) {
			Object element = itr.next();
			System.out.println(element);
		}
		
	}

}
