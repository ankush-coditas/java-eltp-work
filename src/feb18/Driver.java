package feb18;


class Addition {
    //add method overloading for add()

    public int add(int a, int b) {

        return a + b;
    }

    public int add(int a, int b, int c) {

        return a + b + c;
    }

    public int add(int a, int b, int c, int d) {

        return a + b + c + d;
    }


}

class Varargs_Addition {

    public int add(Integer... a) {
        int sum = 0;
        for (Integer i : a
        ) {
            sum += i;
        }
        return sum;
    }

}


public class Driver {
    public static void main(String[] args) {
        Varargs_Addition obj = new Varargs_Addition();
        System.out.println("================Using Var_args=======================");
        System.out.println("Addition is " + obj.add(1, 3, 2));
        System.out.println("=======================================");
        System.out.println("Addition is " + obj.add(1, 3, 2, 7, 8, 9));
        System.out.println("=======================================");
        System.out.println("Addition is " + obj.add(1, 3, 2, 8, 9, 8, 9, 7, 6));
        Addition a = new Addition();
        System.out.println("===============not using Var_arg===================");
        System.out.println("Addtion is " + a.add(2, 3));
        System.out.println("==================================");
        System.out.println("Addtion is " + a.add(2, 3, 6));
        System.out.println("==================================");
        System.out.println("Addtion is " + a.add(2, 3, 7, 7));


    }
}
/**
 * output
 *"C:\Program Files\Java\jdk1.8.0_261\bin\java.exe" "-javaagent:D:\IDE\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=61916:D:\IDE\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_261\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\rt.jar;D:\Java_Work\out\production\Java_Work" feb18.Driver
 * ================Using Var_args=======================
 * Addition is 6
 * =======================================
 * Addition is 30
 * =======================================
 * Addition is 53
 * ===============not using Var_arg===================
 * Addtion is 5
 * ==================================
 * Addtion is 11
 * ==================================
 * Addtion is 19
 *
 * Process finished with exit code 0
 */