package feb8th;



public class Test {


    public static void main(String args[]){
        RegisterUser obj_r=new RegisterUser();
     try {
         try {
             obj_r.validate(15,"Indan");
         }catch (InvalidAgeException e){
             System.out.println("Invalid Execption caught");

         }
         obj_r.validate("Indan");
     } catch (InvalidCitizenshipException e){
         System.out.println("InvalidCitizen ");
     }

    }
}
