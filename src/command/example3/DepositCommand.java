package command.example3;

public class DepositCommand implements Command{
    BankAccount bankAccount;
    int value;

    public DepositCommand(BankAccount bankAccount, int value) {
        this.bankAccount = bankAccount;
        this.value = value;
    }

    @Override
    public void execute() {
        bankAccount.deposit(value);
    }

    @Override
    public void undo() {
        bankAccount.withdraw(value);
    }
}
