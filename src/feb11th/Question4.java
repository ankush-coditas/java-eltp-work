package feb11th;

class TH implements Runnable{

    @Override
    public void run() {
       for (int i =0; i<10;i++) {
           if (i % 2 != 0)
               System.out.println(i);
       }

    }
}
public class Question4  extends Thread {

    public static void main(String[] args) {
        TH obj = new TH();
        Thread t2 = new Thread(obj);
        t2.start();
    }

}
