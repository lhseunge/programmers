package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12})));
    }

    public int[] solution(int n, int[] numlist) {

        List<Integer> answer = new ArrayList<>();

        for(int i : numlist) {
            if (i % n == 0) {
                answer.add(i);
            }
        }

        return answer.stream().mapToInt(x->x).toArray();
    }
}
