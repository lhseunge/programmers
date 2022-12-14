package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution("i love you~"));
    }

    public int solution(String message) {
        return message.length() * 2;
    }
}
