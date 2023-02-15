package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution("people"));
    }

    public String solution(String my_string) {
       return Arrays.stream(my_string.split("")).distinct().collect(Collectors.joining());

    }
}
