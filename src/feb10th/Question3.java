package feb10th;

import java.io.Console;

public class Question3 {
    public static void main(String[] args) {
        Console console   = System.console();
        char[] pass;
       console.format("Enter your details - \n");
        String str = console.readLine("Enter your name ");
        pass =console.readPassword("Enter your password ");
       console.printf("Your details are - \n");
        console.format("Your username is : %s \n", str);
        for(char ch : pass)
            console.printf("%c", ch);
    }
}
