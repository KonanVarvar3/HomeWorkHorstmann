package com.horstmann.part1.ex6;

import java.math.BigInteger;

public class LargestFactorial {

    //Ex6
    public BigInteger factorial(int number) {
        if (number == 0 || number == 1) {
            return BigInteger.valueOf(1);
        }
        if (number < 0) {
            return BigInteger.valueOf(-1);
        }
        BigInteger result = BigInteger.valueOf(1);

        for (int i = 2; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
