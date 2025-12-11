
class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;
    static String bankName = "Sonali Bank"; 
    
    BankAccount(String accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    void showAccountInfo() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance        : " + balance);
        System.out.println("Bank Name      : " + bankName);
        System.out.println("---------------------------");
    }

    static void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }
}


public class Main {
    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount("1001", "Shuvo", 5000);
        BankAccount account2 = new BankAccount("1002", "Samiul", 10000);

        BankAccount.showBankName();
        System.out.println();
        
        account1.showAccountInfo();
        account2.showAccountInfo();
    }
}
