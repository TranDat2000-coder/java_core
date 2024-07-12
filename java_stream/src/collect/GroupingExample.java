package collect;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingExample {

    public static void main(String[] args) {

        List<Student> lstStd = Stream.of(
                new Student("Dat", 24),
                new Student("Hung", 24),
                new Student("Trang", 26),
                new Student("Dung", 26),
                new Student("Phat", 17)
        ).collect(Collectors.toList());

        Map<Integer, List<Student>> people = lstStd.stream().collect(Collectors.groupingBy(Student::getAge));

        people.forEach((age, std) ->{
            System.out.println("Age: " + age + ": " + std);
        });
    }
}
