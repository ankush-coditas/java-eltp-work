package feb10th;

public class Empolyee {
int emp_id;
String  emp_name;

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    int sal;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }



    @Override
    public String toString() {
        return "Empolyee{" +
                "emp_id=" + emp_id +
                ", emp_name=" + emp_name +
                ", emp_dept=" + sal +
                '}';
    }

    public Empolyee(int emp_id, String  emp_name, int emp_dept) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.sal = emp_dept;
    }
}
