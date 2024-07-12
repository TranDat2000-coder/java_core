package match;

import java.util.Arrays;
import java.util.List;

//Kiểm tra xem tất cả các số trong danh sách có chia hết cho 2 không.
public class AllMatchExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 8, 10);

        boolean result = numbers.stream().allMatch(n -> n % 2 == 0);
        System.out.println("Result: " + result);
    }
}
