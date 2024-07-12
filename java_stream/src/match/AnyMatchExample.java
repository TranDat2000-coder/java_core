package match;

import java.util.Arrays;
import java.util.List;

//Kiểm tra xem danh sách có bất kì từ nào bắt đầu bằng ký tự a hay không
public class AnyMatchExample {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "apricot", "avocado");

        boolean result = words.stream().anyMatch(n -> n.startsWith("a"));
        System.out.println("Result: " + result);
    }
}
