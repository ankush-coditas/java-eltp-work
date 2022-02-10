package feb10th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
// id name sal
public class BufferReaderDemo {
    public Empolyee acceptDetails() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Id");
        int id = Integer.parseInt(br.readLine());
        System.out.println("Enter the Name");
        String   name= br.readLine();
        System.out.println("Enter the Salary");
        int sal = Integer.parseInt(br.readLine());
        Empolyee em = new Empolyee(id,name,sal);
        return  em;

    }
    public void showDetails( Empolyee empolyee){
        System.out.println("Employee Id"+empolyee.getEmp_name() );
        System.out.println("Employee name"+empolyee.getEmp_id());
        System.out.println("Employee salary"+empolyee.getSal());

    }
    public static void main(String[] args) throws IOException{
        BufferReaderDemo obj = new BufferReaderDemo();
        Empolyee e1 =  obj.acceptDetails();
        obj.showDetails(e1);
    }
}
/**
 * Enter the Id
 * 67
 * Enter the Name
 * ank
 * Enter the Salary
 * 700000
 * Employee Idank
 * Employee name67
 * Employee salary700000
 *
 * Process finished with exit code 0
 */