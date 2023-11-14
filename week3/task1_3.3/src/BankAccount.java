//You'll create a BankAccount class with instance variables
// for the account number and balance. The totalAccounts static
// variable keeps track the total number of accounts.
// You'll also implement instance methods for depositing and
// withdrawing funds, as well as a static method to retrieve
// the total number of accounts. The main method demonstrates
// how to use the class by creating accounts, performing transactions,
// and checking the total number of accounts.
public class BankAccount {
    // Your variable declarations and code here
    private static int totalAccounts = 0;
    private long accountNumber;
    private double balance;
    public BankAccount(long initialBalance){
        this.accountNumber = totalAccounts + 1;
        this.balance = initialBalance;
        totalAccounts++;
    }

    /*public int getTotalAccounts() {
        int totalAccount += accountNumber;
        return totalAccount;
    }*/
    public void deposit(double depositAmount){
        balance += depositAmount;
    }

    public void withdraw(double withdrawAmount){
        if (withdrawAmount <= balance) {
            balance -= withdrawAmount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public long getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public static int getTotalAccounts() {
        return totalAccounts;
    }
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}