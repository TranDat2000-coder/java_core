package find;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstExample {
    public static void main(String[] args) {

        List<String> lstStr = Arrays.asList("apple", "samsung", "xiaomi", "oppo");

        Optional<String> element = lstStr.stream().findFirst();
        element.ifPresent(System.out::println);
    }
}
