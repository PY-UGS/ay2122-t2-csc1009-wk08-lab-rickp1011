package lab;

public class checkaccount {
    public  long number;
    public  double balance;

    public checkaccount(long number,double balance) {
        this.number=number;
        this.balance=balance;
    }

    public  long getNumber() {
        return this.number;
    }

    public double getBalance() {
        return this.balance;
    }

    public  void deposit(double depositvalue) {
        this.balance += depositvalue;
    }

    public void withdraw(double withdrawvalue)throws InsufficientFundsException  {
        if(withdrawvalue>this.balance)
        {
            throw new InsufficientFundsException(withdrawvalue-this.balance);
        }
        this.balance -= withdrawvalue;
        System.out.println("Remaining balance: " + this.balance);
    }
}


