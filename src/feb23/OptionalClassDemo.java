package feb23;

import java.util.Optional;

public class OptionalClassDemo {

    public static void main(String[] args)
        {
            String[] string = new String[10];
            Optional<String> checkNull
                    = Optional.ofNullable(string[5]);
            if (checkNull.isPresent()) {
                String word = string[2].toLowerCase();
                System.out.print(word);
            }
            else
                System.out.println(" the String is Null");

            string[2] = "Hellow world";
            Optional<String> value = Optional.of(string[2]);
            System.out.println(value);
            System.out.println(value.isPresent());
            System.out.println(value.isEmpty());
            System.out.println(value.hashCode());
        }
    }

/*
output:
 the String is Null
Optional[Hellow world]
true
false
1661978039


 */
