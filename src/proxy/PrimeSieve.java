package proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//REAL SUBJECT
public class PrimeSieve implements PrimeCheck {

    @Override
    public List<Integer>  getAllThePrime(int n) {
        List<Integer> listofPrime = new ArrayList<>();
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i < n; i++){
            prime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (prime[i])
                listofPrime.add(i);
        }
        return listofPrime;
    }
}