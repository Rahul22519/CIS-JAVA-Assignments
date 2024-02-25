package Assignment9;

//Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
//Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred
public class BankDetails {
    public static void main(String [] args){
        SavingsAccount savingsAccount = new SavingsAccount(200);
        savingsAccount.deposit(50);
        savingsAccount.withdraw(120);
        savingsAccount.withdraw(70);
    }
}

class BankAccount{
    private double balance;

    public BankAccount(double initialBalance){
        balance = initialBalance;
    }
    void deposit(double amount){
        balance += amount;
        System.out.println(amount+ " Deposited. New Balance = "+balance);
    }
    void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println(amount+ " withdrawn successfully. New Balance = "+balance);
        }
        else {
            System.out.println("Insufficient Funds. Withdrawn cancelled: "+balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount{
    public SavingsAccount(double initialBalance){
        super(initialBalance);
    }
    void withdraw(double amount){
        if(getBalance() - amount >= 100){
            super.withdraw(amount);
        }
        else {
            System.out.println("Minimum balance of 100 is required. " +getBalance());
        }
    }
}
