package feb15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(3);
        l1.add(null);
        List<Integer> l2 = new ArrayList<>();
        l2.add(5);
        l2.add(6);
        l2.add(7);

        // Itereating by for loop
        for(int i =0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        System.out.println("**********************************************");
        //      // Itereating by for each
        for (Integer i: l1){
            System.out.println(i);
        }
        //add one list into another list
        l2.addAll(l1);
        //      // Itereating by  iterator
        Iterator<Integer> it = l2.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("**********************************************");
        ListIterator lit = l1.listIterator();
        System.out.println("Iterating the elements in forward direction: ");
        while (lit.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Iterating the elements in backward direction: ");
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }
        // list of method
        System.out.println(l1.isEmpty());
        System.out.println(l1.remove(1));
        System.out.println(l1.retainAll(l2));
        System.out.println(l1.contains(3));

    }
}
/**
 *      ==>1)NULL       ==>ALLOWED
 *        ==>2)DUPLICATES  ==>Allowed
 *        ==>3)ORDER       ==>Insertion Order
 */