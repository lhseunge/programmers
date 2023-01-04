package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
    }

    public int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }
}
