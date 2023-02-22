package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(2, 5));
    }

    public int solution(int M, int N) {

        if (M == 1 && N == 1) return 0;

        return (M - 1) + M * (N - 1);
    }
}
