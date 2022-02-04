package aggregation;

class DOB{
    int day;
    int month;
     int year;

    public DOB(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
         return "Date of Birth is ::"+day+"/"+month+"/"+year;
    }
}
class Teacher{
int id;
String name;
DOB dob;

    public Teacher(int id, String name, DOB dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }
}
class Employee{
    int id;
   String name ;
    double salary;
    DOB db;

    public Employee(int id,String name, double salary, DOB db) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.db = db;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name=" + name +
                ", salary=" + salary +
                ", db=" + db +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        DOB obj_dob = new DOB(5,7,2002);
        Employee employee = new Employee(4,"pratik",20000,obj_dob);
        System.out.println(employee);
    }
}
