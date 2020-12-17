package proxy;

import java.util.HashMap;
import java.util.List;

//PROXY SUBJECT
public class PrimeSieveProxy extends PrimeSieve{
    private HashMap<Integer, List<Integer>> map ;
    public PrimeSieveProxy() {
        map = new HashMap<>();
    }

    @Override
    public List<Integer>  getAllThePrime(int n) {
        if(map.containsKey(n)){
            System.out.println("\n==============>Display the value from cache....");
            return map.get(n);
        }else {
            System.out.println("\n==============>Display the value without cache....");
            List<Integer> listofPrime =  super.getAllThePrime(n);
            map.put(n,listofPrime);
            return listofPrime;
        }
    }
}
