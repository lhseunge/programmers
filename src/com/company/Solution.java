package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[] {-10, 20}));
    }

    public int solution(int[] numbers) {
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                answer = Math.max(answer, numbers[i] * numbers[j]);
            }

        }

        if (numbers.length == 2) {
            answer = numbers[0] * numbers[1];
        }

        return answer;
    }
}
