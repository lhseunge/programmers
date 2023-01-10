package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution("cccCCC"));
    }

    public String solution(String my_string) {
        String[] my_strings = my_string.split("");

        for(int i = 0; i < my_strings.length; i++) {
            if(my_strings[i].matches("[A-Z]")) {
                my_strings[i] = my_strings[i].toLowerCase();
            } else if (my_strings[i].matches("[a-z]")) {
                my_strings[i] = my_strings[i].toUpperCase();
            }
        }

        return String.join("", my_strings);
    }
}
