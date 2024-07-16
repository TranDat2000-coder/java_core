package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class MapToDouble {
    public static void main(String[] args) {
//        List<String> lstStr = Arrays.asList("1.3", "3.4", "2.6");
//
//        DoubleStream doubleStream = lstStr.stream()
//                .mapToDouble(Double::parseDouble);
//        double sum = doubleStream.sum();
//
//        System.out.println("Sum: " + sum);

        List<Person1> people = Arrays.asList(
                new Person1("Alice", 165.5),
                new Person1("Bob", 170.0),
                new Person1("Charlie", 180.2)
        );
        DoubleStream doubleStream = people.stream().mapToDouble(n -> n.height);
        double averageHeight = doubleStream.average().orElse(0.0);
        System.out.println("Average height: " + averageHeight);
    }
}
