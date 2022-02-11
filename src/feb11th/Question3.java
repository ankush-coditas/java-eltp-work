package feb11th;
 class MyThread implements  Runnable{

     @Override
     public void run() {
         System.out.println("IN THREAD");
     }
 }
public class Question3 {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
       Thread t1 = new Thread(obj);
       Thread t2 = new Thread(obj);
       Thread t3 = new Thread(obj);
       t1.start();
       t2.start();
       t3.start();
       t1.setName("T1");
       t2.setName("T2");
       t3.setName("T3");
       System.out.println(t2.getName());
       System.out.println(t1.getId());

        t2.setPriority(7);
        System.out.println( t3.getState());
        System.out.println(t3.getClass());

    }
}
