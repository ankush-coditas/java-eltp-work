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
            acc1.withdraw(sc.nextInt());
        }catch (InsufficientBalanceException e){
            System.out.println("InsufficientBalanceException raised");
        } catch (Exception e){
            System.out.println("Exception "+e.getMessage());
        }

    }
}
