package com.company;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(new Solution().solution(5, 15)));
    }

    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int start = (total / num) - ((num - 1) / 2);

        for (int i = 0; i < num; i++) {
            answer[i] = start;
            start++;
        }

        return answer;
    }
}
