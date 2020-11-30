package strategy.example1;

public class BkashStrategy  implements  PaymentStrategy{

    private int phoneNumber;

    public BkashStrategy(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount +" is paid using Bkash");
    }
}
