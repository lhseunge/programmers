package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution("hello", 3));
    }

    public String solution(String my_string, int n) {

        char[] temp = my_string.toCharArray();

        StringBuilder answerBuilder = new StringBuilder();

        for(char c : temp) {
            answerBuilder.append(String.valueOf(c).repeat(n));
        }

        return answerBuilder.toString();
    }
}
