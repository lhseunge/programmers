package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[] {7, 77, 17}));
    }

    public int solution(int[] array) {

        StringBuilder sb = new StringBuilder();

        for (int i : array) {
            sb.append(i);
        }

        return (int) Arrays.stream(sb.toString().split("")).filter(x-> x.equalsIgnoreCase("7")).count();

    }

}
