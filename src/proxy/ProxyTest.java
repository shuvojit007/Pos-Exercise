package proxy;

import org.junit.Test;

//CLIENT
public class ProxyTest {
    @Test
    public void checkProxy() {
        // print all the  primes number which is smaller than n
        PrimeCheck primeCheck = new PrimeSieveProxy();
        primeCheck.getAllThePrime(10).forEach(System.out::println);
        primeCheck.getAllThePrime(5).forEach(System.out::println);

        primeCheck.getAllThePrime(10).forEach(System.out::println);
        primeCheck.getAllThePrime(5).forEach(System.out::println);
    }
}


