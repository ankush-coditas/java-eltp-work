package feb10th;

import java.util.Scanner;

public class ScannerDemo {
    public Empolyee acceptDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Id");
        int id = sc.nextInt();sc.nextLine();
        System.out.println("Enter the Name");
        String   name= sc.nextLine();
        System.out.println("Enter the Salary");
        int sal = sc.nextInt();
        Empolyee em = new Empolyee(id,name,sal);
       return  em;
    }
    public void showDetails( Empolyee empolyee){
        System.out.println("Employee Id"+empolyee.getEmp_name() );
        System.out.println("Employee name"+empolyee.getEmp_id());
        System.out.println("Employee salary"+empolyee.getSal());

    }
    public static void main(String[] args) {
       ScannerDemo obj = new ScannerDemo();
       Empolyee e1 =  obj.acceptDetails();
       obj.showDetails(e1);

    }
}
/** output
 * Enter the Id
 * 45
 * Enter the Name
 * ank
 * Enter the Salary
 * 45000
 * Employee Idank
 * Employee name45
 * Employee salary45000
 *
 * Process finished with exit code 0
 */