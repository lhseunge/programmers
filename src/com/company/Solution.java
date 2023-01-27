package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        System.out.println(new Solution().solution(29423));
    }

    public int solution(int order) {

        return Arrays.stream(String.valueOf(order).split(""))
                .filter(x -> x.equals("3") || x.equals("6") || x.equals("9"))
                .collect(Collectors.joining()).length();

    }
}
