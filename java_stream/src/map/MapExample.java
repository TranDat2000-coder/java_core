package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<String> lstStr =  Arrays.asList("Alice", "Bob", "Charlie");

//        List<String> newStr = lstStr.stream()
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//
//        newStr.forEach(System.out::println);

        List<Person> people = lstStr.stream()
                .map(n -> new Person(n, 30))
                .collect(Collectors.toList());
        people.forEach(n -> System.out.println(n.toString()));
    }
}
