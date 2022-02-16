package feb16;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {

        ArrayDeque<Integer> obj = new ArrayDeque<>();

        obj.offer(1);
        obj.offerFirst(2);
        obj.offerLast(9);
        obj.offer(4);
        obj.add(5);
        obj.addLast(1);
        obj.push(7);
        obj.push(6);



        System.out.println("peek element is "+obj.peek());
        System.out.println("peek first element is "+obj.peekFirst());
        System.out.println("peek last element is "+obj.peekLast());

        System.out.println(obj.poll());
        System.out.println("poll() " +obj);

        System.out.println(obj.pollFirst());
        System.out.println("pollFirst() " +obj);

        System.out.println(obj.pollLast());
        System.out.println("pollLast() " +obj);
        System.out.println(obj);
        System.out.println("adq is empty : "+obj.isEmpty());
        System.out.println("size of adq is : "+obj.size());
        System.out.println("does adq contain 5 : "+obj.contains(5));

        System.out.println(obj);
        System.out.println(obj.element());
        System.out.println(obj.getFirst());
        System.out.println(obj.getLast());
        System.out.println(obj.pop());
        obj.removeFirstOccurrence(2);
        System.out.println(obj);
    }
}
/**
 * "C:\Program Files\Java\jdk1.8.0_261\bin\java.exe" "-javaagent:D:\IDE\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=57812:D:\IDE\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_261\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\rt.jar;D:\Java_Work\out\production\Java_Work" frb16.ArrayDequeDemo
 * peek element is 6
 * peek first element is 6
 * peek last element is 1
 * 6
 * poll() [7, 2, 1, 9, 4, 5, 1]
 * 7
 * pollFirst() [2, 1, 9, 4, 5, 1]
 * 1
 * pollLast() [2, 1, 9, 4, 5]
 * [2, 1, 9, 4, 5]
 * adq is empty : false
 * size of adq is : 5
 * does adq contain 5 : true
 * [2, 1, 9, 4, 5]
 * 2
 * 2
 * 5
 * 2
 * [1, 9, 4, 5]
 *
 * Process finished with exit code 0
 */