package inheritance;


import java.util.Scanner;

class Employee {
    int  hrs;
       int rate;
  public  void computeSalary(){
      System.out.println("Salary"+(hrs*rate));
  }

}
class WageEmployee extends Employee{
    int hrs;
    int rate;
    public void computeSalary(){

        System.out.println("The salary of WageEmployee is"+(hrs*rate));

    }


}
class Sales extends Employee{
    int sales ;
    int commission;
    void ComputeSalary() {
        System.out.println("the sales is ::"+sales+"the commisssion is ::"+commission+"\n the salary is ::"+(sales*commission));
    }



}
class Manager extends Employee{

    int fixedSalary  ;
    int incentive ;

    void ComputeSalary(){

        System.out.println("salary of Manager is ::"+(fixedSalary+incentive));
    }


}
public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of Emloyeee");
        int n = sc.nextInt();
         Employee[] emp = new Employee[n];
        for (int i = 0; i <emp.length ; i++) {
          System.out.println("Employee no ::"+(i+1));
            System.out.println("Enter the detatil of WageEmployee");
            WageEmployee obj_emp = new WageEmployee();
            System.out.println("Enter the no of hrs");
            obj_emp.hrs= sc.nextInt();
            System.out.println("Enter the no of rate");
            obj_emp.rate= sc.nextInt();
            obj_emp.computeSalary();
            System.out.println("Enter the detatil of Sales_Person");
            Sales obj_sales = new Sales();
            System.out.println("Enter the no of sales");
           obj_sales.sales= sc.nextInt();
            System.out.println("Enter the no of comissions");
            obj_sales.commission= sc.nextInt();
            obj_emp.computeSalary();
            System.out.println("Enter the detatil of Manager");
            Manager obj_m = new Manager();
            System.out.println("Enter the no of Fixed Salary");
            obj_m.fixedSalary= sc.nextInt();
            System.out.println("Enter the no of Incentive");
            obj_m.incentive= sc.nextInt();
            obj_emp.computeSalary();
        }


    }
}