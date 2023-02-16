package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{3, 10, 28}, 20));
    }

    public int solution(int[] array, int n) {

        Arrays.sort(array);

        if (n <= array[0]) return array[0];
        if (n >= array[array.length - 1]) return array[array.length - 1];

        for (int i = 0; i <= array.length - 1; i++) {

            if (n == array[i]) return array[i];

            if (n < array[i]) {
                int a = array[i] - n;
                int b = n - array[i - 1];

                return a < b ? array[i] : array[i - 1];

            }

        }
        return 0;
    }
}
