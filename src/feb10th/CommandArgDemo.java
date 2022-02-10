package feb10th;

public class CommandArgDemo {
    public static void main(String[] args) {

        int id = Integer.parseInt(args[0]);

        String   name= args[1];

        int sal =  Integer.parseInt(args[2]);
        Empolyee em = new Empolyee(id,name,sal);
        System.out.println(em);
    }
}
