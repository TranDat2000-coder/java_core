import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class GenerateExample {
    public static void main(String[] args) {

        /**
         * Generate
         */
//        Stream<Double> randomNumbers = Stream.generate(Math::random);
//        randomNumbers.limit(10).forEach(System.out::println);

        /**
         * Iterate
         */
//        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 1);
//        infiniteStream.limit(10).forEach(System.out::println);

        /**
         * Limit
         *
         */
        List<String> lstStr = Arrays.asList("Ronaldo", "Messi", "Minamino", "Son Helmine");
        lstStr.stream().limit(5).forEach(System.out::println);


    }
}
