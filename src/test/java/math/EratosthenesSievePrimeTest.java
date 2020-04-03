package math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EratosthenesSievePrimeTest {

    @Test
    void primes() {
        System.out.println(EratosthenesSievePrime.primes(100));
    }
}