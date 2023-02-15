package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution("allpe",	"apple"));
    }

    public int solution(String before, String after) {

        List<Integer> beforeList = before.chars().sorted().boxed().collect(Collectors.toList());
        List<Integer> afterList = after.chars().sorted().boxed().collect(Collectors.toList());

        return beforeList.equals(afterList) ? 1 : 0;
    }
}
