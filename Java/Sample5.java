package Training;
class BankAccount {
    protected double balance;

   
    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

   
    void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    
    double getBalance() {
        return balance;
    }
}


class SavingsAccount extends BankAccount {

    
    SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

   
    @Override
    void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= 100) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Withdrawal denied. Balance cannot fall below $100.");
        }
    }
}


public class Sample5 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(500);         
        SavingsAccount mySavings = new SavingsAccount(500);   
        
       
        myAccount.deposit(200);
        myAccount.withdraw(100);
        System.out.println("BankAccount Balance: $" + myAccount.getBalance());

       
        mySavings.deposit(200);
        mySavings.withdraw(550);  
        mySavings.withdraw(400);  
        System.out.println("SavingsAccount Balance: $" + mySavings.getBalance());
    }
}
