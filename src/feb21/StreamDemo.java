package feb21;

import java.util.Arrays;
import java.util.List;


public class StreamDemo {
    public static void main(String[] args) {

        // maping
        List<String> list = Arrays.asList("Apple", "Mango", "Banana");
        list.stream().map(str -> str.length()).forEach(System.out::println);
        //matching
        boolean bool = list.stream()
                .allMatch(str->str.length()> 5);
        System.out.println(bool);




    }
}
