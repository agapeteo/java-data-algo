package math;

import java.util.ArrayList;
import java.util.List;

public class EratosthenesSievePrime {

    public static List<Integer> primes(int limit) {
        boolean[] arr = new boolean[limit];

        for (int i = 2; i < Math.sqrt(limit); i++) {
            if (arr[i]) continue;
            for (int j = i + i; j < limit; j += i) {
                arr[j] = true;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int k = 2; k < limit; k++) {
            if (!arr[k]) {
                result.add(k);
            }
        }
        return result;
    }
}
