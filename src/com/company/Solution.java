package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(20));
    }

    public int solution(int n) {

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {

                answer++;
            }
        }

        return answer;
    }
}
