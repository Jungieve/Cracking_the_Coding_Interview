package Puzzles;

/**
 * Created by ZihanCong on 16/7/17.
 */
public class Eratosthenes {
    boolean[] sieveOfEratosthenes(int max) {
        boolean[] flags = new boolean[max + 1];
        for (int i = 2; i < max + 1; i++)
            flags[i] = true;
        // 初始素数
        int prime = 2;
        while (prime < max + 1) {
            for (int i = prime * prime; i < flags.length; i += prime)
                flags[i] = false;
            prime = getNextPrime(flags, prime);
        }
        return flags;
    }


    private int getNextPrime(boolean[] flags, int prime) {
        int nextPrime = prime++;
        while (nextPrime < flags.length && !flags[nextPrime])
            nextPrime++;
        return nextPrime;
    }
}
