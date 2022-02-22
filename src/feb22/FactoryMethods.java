
import java.util.*;

public class FactoryMethods	 {
    public static void main(String[] args) {
        Set<String> set = Set.of("red", "yellow", "green");
      Iterator it = set.iterator();
   while(it.hasNext()){

System.out.println(it.next());

}

// for Map 
Map<String, Integer> map = Map.of("Apple", 1 , "Orange", 2, "Banana", 3);
 for(Map.Entry<String, Integer>  et : map.entrySet()){
System.out.println("value  "+et.getValue() +"  "+"  Key "+ et.getKey());

}

    }
}
/*  
Output:

yellow
red
green
value  3    Key Banana
value  2    Key Orange
value  1    Key Apple
  */