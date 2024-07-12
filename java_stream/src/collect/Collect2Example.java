package collect;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect2Example {
    public static void main(String[] args) {

        Stream<String> lstStr = Stream.of("a", "b", "k", "e");

        List<String> result = lstStr.collect(Collectors.toList());

        System.out.println("Result: " + result);
    }
}
