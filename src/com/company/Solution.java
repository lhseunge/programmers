package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution("helloo"));
    }

    public String solution(String s) {

        String[] sArray = Arrays.stream(s.split("")).toArray(String[]::new);

        for (String word : sArray) {
            if (Arrays.stream(sArray).filter(x -> x.equals(word)).count() > 1L) {
                s = s.replace(word, "");
            }
        }

        return Arrays.stream(s.split("")).sorted().collect(Collectors.joining());

    }
}
