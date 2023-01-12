package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution("hi12392")));
    }

    public int[] solution(String my_string) {

        my_string = my_string.replaceAll("[a-zA-Z]", "");

        return Arrays.stream(my_string.split("")).mapToInt(Integer::parseInt).sorted().toArray();
    }

}
