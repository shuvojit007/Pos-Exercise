package strategy.example1;


/**
 * Strategy pattern is useful when we have multiple algorithms for specific task and we want our
 * application to be flexible to chose any of the algorithm at runtime for specific task.
 * link -> https://www.journaldev.com/1754/strategy-design-pattern-in-java-example-tutorial
 * Example : Collections.sort() && Arrays.sort()
 */
public class ShoppingCartTest {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("123",100));
        cart.addItem(new Item("456",200));

        //pay by paypal
        cart.pay(new PaypalStrategy("example@gmail.com","123456"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Jhon Doe","123456798","786","12/20"));
    }
}


