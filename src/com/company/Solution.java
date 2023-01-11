package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        System.out.println(new Solution().solution("dfjardstddetckdaccccdegk", 4));
    }

    public String solution(String cipher, int code) {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= cipher.length(); i++) {
            if (i % code == 0) {
                sb.append(cipher.charAt(i - 1));
            }
        }

        return sb.toString();
    }
}
