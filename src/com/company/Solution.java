package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(12)));
    }

    public int[] solution(int n) {

        List<Integer> result = new ArrayList<>();

        int i = 2;
        while (n != 1) {
            if (n % i == 0) {
                result.add(i);
                n /= i;
                i = 2;
                continue;
            }
            
            i++;
        }

        return result.stream().mapToInt(x->x).distinct().toArray();
    }
}
