package strategy.example1;

/*
Strategy pattern is also known as Policy Pattern
one of the best example -> Collections.sort()
*/
public interface PaymentStrategy {
    public void pay(int amount);
}
