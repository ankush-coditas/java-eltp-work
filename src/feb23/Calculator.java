package feb23;

class Operation{
    public void add(int n1, int n2){
        System.out.println("Addition "+(n1+n2));
    }
    public void sub(int n1, int n2){
        System.out.println("Addition "+(n1-n2));
    }
}
public class Calculator {
    public static void main(String[] args) {
        Operation o = new Operation();
        o.add(9,7);
        o.sub(5,7);
    }
}
