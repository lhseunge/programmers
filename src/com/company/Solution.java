package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution("Python"));
    }

    public String solution(String my_string) {
        my_string = my_string.toLowerCase();

        char[] cArray = my_string.toCharArray();

        Arrays.sort(cArray);

        return String.join("", String.valueOf(cArray));
    }
}
