package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution("      3people         unFollowed me         "));
    }

    public String solution(String s) {

        // request 문자열 소문자 화
        s = s.toLowerCase();

        // 문자열 첫 글자 대문자 화
        String[] sArray = s.split("");

        for (int i = 0; i < sArray.length; i++) {

            if (i == 0) {
                    sArray[i] = sArray[i].toUpperCase();
                    continue;
            }

            if (!" ".equalsIgnoreCase(sArray[i])
                && " ".equalsIgnoreCase(sArray[i - 1])
            ) {
                sArray[i] = sArray[i].toUpperCase();
            }
        }

        return String.join("", sArray);
    }
}
