package feb14;

/*
To develop the code using the synchronized block
 */
class Account
{
    int accno;
    static int balance=500;

    void DisplayBalance()
    {
        System.out.println("*******"
                + ""
                + "****** ACCOUNT BALANCE *************");
        System.out.println("Account Current balance is::"+balance);
    }

        void Withdraw(int amt)//500
    {
        System.out.println("***************** WITHDRAW ****************");
        System.out.println("Withdrawn amount is::"+amt);
        synchronized (this){
            if(balance<1000){
                System.out.println("SORRY!!! Insufficient balance ::"+balance
                        + "\twaiting for deposit...");

                try{
                    wait();
                }catch(Exception e){}
        }

        }

        balance=balance-amt;
        System.out.println("Withdraw Completed...Account Balance::" +balance);//4500
    }

       void Deposit(int amt)//2000
    {
        System.out.println("**************** DEPOSIT ******************");
         synchronized (this){
             balance=balance+amt;//500+2000=>2500
             System.out.println("Deposited amount is::"+amt);
             System.out.println("Deposit Completely...Account Balance::" +balance);

        notify();
         }

    }
}

class Deposit extends Thread{

    Account acc;

    Deposit(Account acc){
        this.acc=acc;
    }
    public void run(){
        acc.Deposit(2000);
    }
}

class Withdraw1 extends Thread{
    Account acc;
    Withdraw1(Account acc){
        this.acc=acc;
    }
    public void run(){
        acc.Withdraw(500);
    }
}

public class AssignmentQue {

    public static void main(String[] args) {
        Account a=new Account();
        a.DisplayBalance();//500
        Deposit d=new Deposit(a);//
        Withdraw1 w=new Withdraw1(a);

        w.start();
        d.start();

    }

}
/** Output
 * ************* ACCOUNT BALANCE *************
 * Account Current balance is::500
 * ***************** WITHDRAW ****************
 * Withdrawn amount is::500
 * SORRY!!! Insufficient balance ::500	waiting for deposit...
 * **************** DEPOSIT ******************
 * Deposited amount is::2000
 * Deposit Completely...Account Balance::2500
 * Withdraw Completed...Account Balance::2000
 *
 * Process finished with exit code 0
 */