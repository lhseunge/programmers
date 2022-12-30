package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution("BCBdbe", "B"));
    }

    public String solution(String my_string, String letter) {

        return my_string.replaceAll(letter,"");
    }
}
