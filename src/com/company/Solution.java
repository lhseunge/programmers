package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution("aAb1B2cC34oOp"));
    }

    public int solution(String my_string) {

        my_string = my_string.replaceAll("[A-Za-z]", "");

        return Arrays.stream(my_string.split("")).mapToInt(Integer::parseInt).sum();
    }
}
