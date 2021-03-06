package feb8th;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Account acc1 = new Account();

        Scanner sc = new Scanner(System.in);

        try {
            try {
                System.out.println("Enter amount to deposite");
                acc1.deposite(sc.nextInt());
            }catch (InvalidAmountException ae){
                System.out.println("InvalidAmountException raised");
            }
            System.out.println("Enter amount to withdraw");
            int amt =sc.nextInt();
            if(amt<0){
                System.out.println("Invalid amt");
            }
            else {
                acc1.withdraw(amt);
            }

        }catch (InsufficientBalanceException e){
            System.out.println("InsufficientBalanceException raised");
        } catch (Exception e){
            System.out.println("Exception "+e.getMessage());
        }

    }
}
/** output
 *
 * Enter amount to deposite
 * 0
 * InvalidAmountException Entered amount is invalid
 * InvalidAmountException raised
 * Enter amount to withdraw
 * 500
 * InsufficientBalanceException Insufficient balance
 * InsufficientBalanceException raised
 *
 * Process finished with exit code 0*/
