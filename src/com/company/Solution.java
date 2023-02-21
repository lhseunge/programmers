package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution("onefourzerosixseven"));
    }

    public long solution(String numbers) {

        List<String> nums = new ArrayList<>();
        nums.add("zero");
        nums.add("one");
        nums.add("two");
        nums.add("three");
        nums.add("four");
        nums.add("five");
        nums.add("six");
        nums.add("seven");
        nums.add("eight");
        nums.add("nine");

        for (int i = 0; i < nums.size(); i++) {
            numbers = numbers.replace(nums.get(i), String.valueOf(i));
        }

        return Long.parseLong(numbers);
    }
}
