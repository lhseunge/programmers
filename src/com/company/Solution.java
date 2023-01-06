package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(930211));
    }

    public int solution(int n) {

        int answer = 0;
        String nToString = n+"";

        char[] nToCharArray = nToString.toCharArray();

        for (char c : nToCharArray) {
            answer += Integer.parseInt(String.valueOf(c));
        }

        return answer;
    }
}
