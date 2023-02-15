package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(36281));
    }

    public int solution(int n) {
        int answer = 0;
        if(n == 1) return 1;

        int fact = 1;

        for (int i = 1; i <= 10; i++) {

            fact *= i;

            if (n == fact) return i;

            if (n < fact) {
                return i - 1;
            }
        }

        return 10;
    }
}
