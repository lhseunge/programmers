package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new int[]{9, 10, 11, 8})));
    }

    public int[] solution(int[] array) {

        int max = Arrays.stream(array).max().getAsInt();

        int idx = 0;

        for (int i = 0 ; i < array.length; i++) {
            if (max == array[i]) {
                idx = i;
                break;
            }
        };

        return new int[]{max, idx};
    }

}
