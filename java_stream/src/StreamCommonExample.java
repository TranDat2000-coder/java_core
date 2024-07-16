import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCommonExample {
    public static void main(String[] args) {

        Stream<String> str1 = Stream.of("a", "b", "c", "f");
        Stream<String> str2 = Stream.of("d", "e", "f", "a", "c");

        List<String> lst = Stream.concat(str1, str2).collect(Collectors.toList());

        //Loại bỏ các phần tử trung lap trong mot luong
        List<String> lstDistinct = lst.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct: " + lstDistinct);

        List<Integer> lstInt = new ArrayList<>();
        System.out.println("Check Empty: " + lstInt.isEmpty());


    }
}
