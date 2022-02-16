package feb16;

import feb10th.Student;

import java.util.Comparator;

public class Employee implements  Comparable<Employee> {


    int id;
    String name;
    float Salary;
    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        Salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }
    Comparator<Student> ct = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    @Override
    public int compareTo(Employee o) {
        if(id>o.id){
            return 1;
        }else if(id<o.id){
            return -1;
        }else{
            return 0;
        }

}


}
class SortName implements  Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}