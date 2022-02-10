package feb10th;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        Console c1 = System.console();
        System.out.println("Enter Employee id::");
        int id = Integer.parseInt(c1.readLine());
        System.out.println("Enter the name of Employee::");
        String name = c1.readLine();
        System.out.println("Enter the salary of Employee::");
         int sal =Integer.parseInt(c1.readLine());
        Empolyee empolyee = new Empolyee(id,name,sal);
        System.out.println(empolyee);
    }
}
