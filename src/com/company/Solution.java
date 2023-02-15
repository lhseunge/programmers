package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(15));
    }
    
    public int solution(int n) {

        Set<Integer> answer = new HashSet<>();

        Set<Integer> numbers = new HashSet<>(); // 약수

        for (int i = 1; i <= n ; i++) {

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    numbers.add(j);
                }
            }

            if (numbers.size() >= 3) {
                answer.add(i);
            }
            numbers.clear();

        }

        return answer.size();
    }
}
