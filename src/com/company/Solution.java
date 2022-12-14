package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new int[]{1, 3, 5}, 1, 2)));
    }

    public int[] solution(int[] numbers, int num1, int num2) {

        List<Integer> answerList = new ArrayList<>();

        for (int i = num1; i <= num2; i ++) {
            answerList.add(numbers[i]);
        }

        int[] answer = answerList.stream().mapToInt(x->x).toArray();
        return answer;
    }
}
