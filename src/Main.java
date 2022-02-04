
class Student{
    private int  studentId;
    private String studentName;
    private   long studentContactNo;
    private String branch;
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getStudentContactNo() {
        return studentContactNo;
    }

    public void setStudentContactNo(long studentContactNo) {
        this.studentContactNo = studentContactNo;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
       this.branch = branch;
    }

    public Student(int studentId, String studentName,long studentContactNo, String branch) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentContactNo = studentContactNo;
        this.branch = branch;
    }
    public  Student(){

    }

    public String toString(){

        return "student id is: "+studentId+"\nstudent name is : "+studentName;
    }
}
public class Main {
    public static void main(String[] args) {
         Student student1 = new Student();
        System.out.println(student1);
        Student student2 = new Student(2,"Ankush ",909879076,"electronic and Telcommunication");
        System.out.println(student2);
    }
}
