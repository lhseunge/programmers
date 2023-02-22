package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution("10 Z 20 Z 1"));
    }

    public int solution(String s) {

        int answer = 0;

        String[] sArray = s.split(" ");

        for (int i = 0; i < sArray.length; i++) {

            if (sArray[i].equals("Z")) {
                answer -= Integer.parseInt(sArray[i - 1]);
            } else {
                answer += Integer.parseInt(sArray[i]);
            }
        }

        return answer;
    }
}
