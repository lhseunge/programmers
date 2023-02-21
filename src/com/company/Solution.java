package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution("aAb1B2cC34oOp"));
    }

    public int solution(String my_string) {

        my_string = my_string.replaceAll("[a-zA-Z]", " ").trim();

        return Arrays.stream(my_string.split(" ")).filter(x-> !x.isEmpty()).mapToInt(Integer::parseInt).sum();
    }
}
