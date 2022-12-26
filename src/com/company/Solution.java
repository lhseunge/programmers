package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution("205"));
    }

    public String solution(String rsp) {

        String answer = "";
        StringBuilder answerBuilder = new StringBuilder(answer);

        String[] reqArray = rsp.split("");

        Arrays.stream(reqArray).forEach(x-> {
                if (x.equalsIgnoreCase("2")) answerBuilder.append("0");
                if (x.equalsIgnoreCase("0")) answerBuilder.append("5");
                if (x.equalsIgnoreCase("5")) answerBuilder.append("2");
        });

        answer = answerBuilder.toString();

        return answer;
    }
}
