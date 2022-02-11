package feb11th;

public class Question1 extends Thread {
    @Override
    public void run() {
        System.out.println("In Thread");
    }

    public static void main(String[] args) {
        Question1 question1 = new Question1();

        question1.start();
      //  driver.start();//java.lang.IllegalThreadStateException

    }
}
/**
 * No we can not start again because the thread is starting at once if we try to restart then it is showing the
 * execption
 */