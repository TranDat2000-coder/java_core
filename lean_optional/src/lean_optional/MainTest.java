package lean_optional;

import java.util.Optional;

public class MainTest {

	public static void main(String[] args) {
		
		String[] str = new String[10];
		str[5] = "JAVA OPTIONAL CLASS EXAMPLE";
		
//		Optional<String> checkNull = Optional.ofNullable(str[5]);
//		if(checkNull.isPresent()) {
//			String lowercaseString = str[5].toUpperCase();
//			System.out.println(lowercaseString);
//		}else {
//			System.out.println("string is not present");
//		}
		
//		if(checkNull.isPresent()) {
//			checkNull.ifPresent(System.out::println);
//			System.out.println(checkNull.get());
//			System.out.println(str[5].toLowerCase());
//		}else {
//			System.out.println("Không có giá trị");
//		}
		
		//Trả về một thể hiện trống của Optional class
		Optional<String> empty = Optional.empty();
		System.out.println(empty);
		
		//Trả về một non-empty Optional
		Optional<String> value = Optional.of(str[5]);
		System.out.println("Filtered value: " + value.filter((s)->s.equals("ABC")));
		System.out.println("Filtered value: " + value.filter((s)->s.equals("JAVA OPTIONAL CLASS EXAMPLE")));
		
		//Trả về một giá trị Optional, nếu không có giá trị, nó sẽ ném ra một NotSuchElementException
		System.out.println("Getting value: " + value.get());
		
		//Trả về một hashCode của giá trị
		System.out.println("Getting hashCode: " + value.hashCode());
		
		//Trả về true nếu có giá trị, ngược lại trả về false
		System.out.println("Is value present: " + value.isPresent());
		
		//Nó trả về non-empty Optional nếu có giá trị, nếu không trả về tùy chọn trống
		System.out.println("Nullable Optional: " + Optional.ofNullable(str[5]));
		
		//Nó trả về giá trị nếu có, nếu không thì trả về giá trị đã chỉ định
		System.out.println("orElse: " + value.orElse("Value is not present"));
		System.out.println("orElse: " + empty.orElse("Value is not present"));
		
		value.ifPresent(System.out::println);
	}
}
