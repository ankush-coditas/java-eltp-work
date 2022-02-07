package exceptionHandlingConcept;

public class Question1 {
    public static void main(String[] args) {
       Object obj = new Object();

      try{
          String st = (String) obj;
      }
      catch (ClassCastException e ){
          System.out.println("ClassCastException is Caught");
      }


    }
}
