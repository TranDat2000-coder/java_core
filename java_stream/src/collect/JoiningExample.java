package collect;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a", "b", "e", "m");

        String result = stream.collect(Collectors.joining(", "));
        System.out.println("Result: " + result);
    }
}
