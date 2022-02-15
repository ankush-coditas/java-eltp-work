package feb15;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<Integer, String>();
        m.put(1, "A");
        m.put(3, "B");
        m.put(5, "C");
        m.put(7, "D");
        m.put(9, "E");
        m.put(9, null);
        //Travelles through the map
        for (Map.Entry m1 : m.entrySet()) {
            System.out.println("Key==>" + m1.getKey() + " " + "==>Value:" + m1.getValue());
        }
        //Method
        System.out.println("*************************************");
        System.out.println("Contains key or not==>" + m.containsKey(3));
        System.out.println("Contains valur or not==>" + m.containsValue("E"));
        System.out.println("Size is==>" + m.size());
        System.out.println("Empty==>" + m.isEmpty());
        m.replace(1, "ABC");
        System.out.println(m.get(2));

    }
}

/*
    Hashmap==>
            1) Null ==> Allowed
            2) Duplicate ==> Not Allowed
            3) Order ==> Unorder
*/