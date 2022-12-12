package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution("jaron"));
    }

    public String solution(String my_string) {

        StringBuilder temp = new StringBuilder();

        for (int i = my_string.length() - 1; i >= 0; i--) {
            temp.append(my_string.charAt(i));
        }

        return temp.toString();
    }
}
