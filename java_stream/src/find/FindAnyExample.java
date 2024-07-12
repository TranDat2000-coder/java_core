package find;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyExample {
    public static void main(String[] args) {

        List<String> lstStr = Arrays.asList("apple", "samsung", "xiaomo", "oppo");
        Optional<String> anyElement = lstStr.stream().findAny();
        anyElement.ifPresent(System.out::println);

        List<String> emptyLst = Arrays.asList();
        Optional<String> emptyElement = emptyLst.stream().findAny();
        if(emptyElement.isPresent()){
            System.out.println(emptyElement.get());
        }else{
            System.out.println("No elements found");
        }
    }
}
