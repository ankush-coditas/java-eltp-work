package feb10th;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the name ");
        String name = sc.nextLine();
        System.out.println("Enter  the id ");
        int id = sc.nextInt();
        System.out.println("Enter  the marks ");
        int marks = sc.nextInt();
        Student s1 = new Student(name,id,marks);
        System.out.println(s1);
        System.out.println("================================================");

        System.out.println("Enter  the id ");
        int s_id = sc.nextInt();
        System.out.println("Enter  the marks ");
        int s_marks = sc.nextInt();   sc.nextLine();
        System.out.println("Enter  the name ");
        String s_name = sc.nextLine();
        Student s2 = new Student(s_name,s_id,s_marks);
        System.out.println(s2);
    }
}
/** output:
 * Enter  the name
 * ankush
 * Enter  the id
 * 45
 * Enter  the marks
 * 89
 * Student{name='ankush', id=45, marks=89}
 * ================================================
 * Enter  the id
 * 76
 * Enter  the marks
 * 89
 * Enter  the name
 * pratik
 * Student{name='pratik', id=76, marks=89}
 *
 * Process finished with exit code 0
 */
