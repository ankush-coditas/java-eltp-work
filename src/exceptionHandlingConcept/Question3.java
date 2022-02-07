package exceptionHandlingConcept;

public class Question3 {
    public static void main(String[] args) {

            int[] array = new int[10]; int sum = 0;

            // good code
        try {

            for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Array Index out of bound array is going out of size");
        }
        catch (Exception e){
            System.out.println("Exception");
        }



    }
}
