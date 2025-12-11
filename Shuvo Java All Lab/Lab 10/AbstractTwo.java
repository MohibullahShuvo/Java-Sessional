
interface ATMService {
    void withdraw(double amount);
    void deposit(double amount);
    void checkBalance();
}


class DBBL implements ATMService {
    private double balance;

    
    DBBL(double initialBalance) {
        balance = initialBalance;
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}


public class AbstractTwo {
    public static void main(String[] args) {
        
        DBBL myAccount = new DBBL(10000);

        
        myAccount.checkBalance();
        myAccount.deposit(5000);
        myAccount.withdraw(3000);
        myAccount.checkBalance();
    }
}
