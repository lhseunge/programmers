package com.company;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(5, 3));
    }

    public int solution(int balls, int share) {

        BigInteger n = new BigInteger(String.valueOf(fact(balls)));
        BigInteger m = new BigInteger(String.valueOf(fact(share)));
        BigInteger nm = new BigInteger(String.valueOf(fact(balls - share)));

        BigInteger result = n.divide(nm.multiply(m));

        return result.intValue();
    }

    public static BigInteger fact(int n) {

        BigInteger result = new BigInteger("1");

        for (int i = n; i >= 1; i--) {
            result = result.multiply(new BigInteger(String.valueOf(i)));
        }

        return new BigInteger(String.valueOf(result));
    }
}
