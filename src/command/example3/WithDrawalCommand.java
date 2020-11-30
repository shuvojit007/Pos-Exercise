package command.example3;

public class WithDrawalCommand implements Command{
    BankAccount bankAccount;
    int value;

    public WithDrawalCommand(BankAccount bankAccount, int value) {
        this.bankAccount = bankAccount;
        this.value = value;
    }

    @Override
    public void execute() {
        bankAccount.withdraw(value);
    }

    @Override
    public void undo() {
        bankAccount.deposit(value);
    }
}
