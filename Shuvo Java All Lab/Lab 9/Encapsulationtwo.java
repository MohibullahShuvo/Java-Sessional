
class BankAccount {
    
    private String accountHolder;
    private String accountNumber;
    private double balance;

    
    void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    
    String getAccountHolder() {
        return accountHolder;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    
    void showAccountInfo() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
    }
}


public class Encapsulationtwo {
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount();

        
        account.setAccountHolder("Shuvo");
        account.setAccountNumber("100200300");
        account.setBalance(15000.50);

        
        account.showAccountInfo();
    }
}
