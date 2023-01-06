package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(144));
    }

    public String solution(String my_string) {

        String[] vowel = {"a","e","i","o","u"};

        for (String s : vowel) {
            my_string = my_string.replaceAll(s, "");
        }
        
        return my_string;
    }
}
