package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{5, 5}));
    }

    public int solution(int[] sides) {

        Arrays.sort(sides);

        int a = sides[1];
        int b = sides[0];

        // a가 제일 큰 케이스
        int case1 = 0;
        // c가 제일 큰 케이스
        int case2 = 0;

        // case1
        // a between a-b and a - 1
        for (int i = a - b; i < a; i++) {
            case1++;
        }

        // case2
        // c between a-b and a - 1
        for (int i = a + 1; i <= a + b - 1; i++) {
            case2++;
        }

        return case1 + case2;
    }
}
