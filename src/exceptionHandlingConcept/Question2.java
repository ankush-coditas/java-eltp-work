package exceptionHandlingConcept;

public class Question2 {
    public static void main(String[] args) {
         String s = "hellow";


        try {
            Integer i = Integer.valueOf(s);
        }catch (NumberFormatException e){

            System.out.println("NumberFormatException"+e);
        }
    }
}
