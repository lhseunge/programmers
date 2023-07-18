package com.company;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        System.out.println(new Solution().solution(40));
    }

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {

            answer++;

            answer = numCheck(answer);

        }

        return answer;
    }

    private int numCheck(int answer) {

        if (Arrays.asList(String.valueOf(answer).split("")).contains("3") || answer % 3 == 0) {
            return numCheck(answer + 1);
        }

        return answer;
    }
}
