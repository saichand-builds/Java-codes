package Encapsulation;

public class HdfcAccount {


    public String AccoutHolderName;
    public double AccountBalence;

    public HdfcAccount(String accoutHolderName, double accountBalence) {
        AccoutHolderName = accoutHolderName;
        AccountBalence = accountBalence;

        if (accountBalence >= 0) {
            this.AccountBalence = accountBalence;
        } else {
            this.AccountBalence = 0;
        }
    }

    //Deposit
    public void deposit(double amount) {

        if (amount > 0) {
            AccountBalence = AccountBalence + amount;
            System.out.println("Deposit  " + amount);
        } else {
            System.out.println("Invalid deposit");
        }
    }

    public void withdraw(double amount) {

        if (amount > 0 && amount <= AccountBalence) {
            AccountBalence = AccountBalence - amount;
            System.out.println("Withdraw Amount  " + amount);
        } else {
            System.out.println("Invalid withdraw Amount");
        }
    }
}

