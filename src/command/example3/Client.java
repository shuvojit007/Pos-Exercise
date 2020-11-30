package command.example3;

import org.junit.Assert;
import org.junit.Test;

public class Client {
    @Test
    public void clientGoToBank(){
        BankAccount bankAccount =new BankAccount();

        DepositCommand depositCommand1 = new DepositCommand(bankAccount,100);
        DepositCommand depositCommand2 = new DepositCommand(bankAccount,200);

        Bank bank = new Bank();
        bank.addCommand(depositCommand1);
        bank.addCommand(depositCommand2);

        bank.executeAllCommand();

        Assert.assertEquals("Total Deposit Value should be 300",300,bankAccount.getBalance());

        bank.undo();
        Assert.assertEquals(100,bankAccount.getBalance());

        WithDrawalCommand withDrawalCommand = new WithDrawalCommand(bankAccount , 50);
        bank.addCommand(withDrawalCommand);
        bank.executeLastCommand();
        Assert.assertEquals(50,bankAccount.getBalance());
        bank.undo();
        Assert.assertEquals(100,bankAccount.getBalance());


        System.out.println(bankAccount.getBalance());
    }
}
