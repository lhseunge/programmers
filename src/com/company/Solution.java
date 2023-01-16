package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(29)));
    }

    public int[] solution(int n) {

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= n; i++ ) {
            if(n % i == 0) result.add(i);
        }

        return result.stream().mapToInt(x->x).toArray();
    }

}
