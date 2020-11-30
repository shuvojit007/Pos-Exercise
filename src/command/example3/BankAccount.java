package command.example3;

public class BankAccount {
    private int balance = 0;

    public void deposit(int value){
        this.balance=balance+value;
    }

    public void withdraw(int value){
        this.balance=balance-value;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
