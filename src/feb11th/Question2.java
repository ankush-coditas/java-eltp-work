package feb11th;

public class Question2 extends Thread {
    @Override
    public void run() {
        System.out.println("In Thread");
    }

    public static void main(String[] args) {
        Question2 question2 = new Question2();

        question2.start();
         question2.run();

    }
}
