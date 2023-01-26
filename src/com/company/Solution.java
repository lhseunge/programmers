package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution("hello", 1, 2));
    }

    public String solution(String my_string, int num1, int num2) {

        char originalNum1Char = my_string.charAt(num1);
        char originalNum2Char = my_string.charAt(num2);

        String[] answerArray = my_string.split("");

        answerArray[num1] = String.valueOf(originalNum2Char);
        answerArray[num2] = String.valueOf(originalNum1Char);

        return String.join("", answerArray);

    }
}
