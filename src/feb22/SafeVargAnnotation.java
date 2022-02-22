package feb22;

import java.util.ArrayList;
import java.util.List;

public class SafeVargAnnotation {

    @SafeVarargs
    private final void print(List... fruit)
    {
        for (List<String> topic : fruit) {
            System.out.println(topic);
        }
    }
    public static void main(String[] args) {
        SafeVargAnnotation obj = new SafeVargAnnotation();
        List<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        list.add("Kiwi");
        obj.print(list);
    }
}
