package feb8th;

public class Account {
    private int  balance;
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public void  deposite(int amount){
        if(amount<=0){
            throw new InvalidAmountException("Entered amount is invalid");
        } else {
            this.balance += amount;
        }
    }
    public  void withdraw(int amount){
        if (amount >balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        else {
            this.balance-= amount;
        }
    }

}
