package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution("abc1Addfggg4556b", 6)));
    }

    public String[] solution(String my_str, int n) {

        List<String> result = new ArrayList<>();
        String word = null;
        int idx = 0;
        int endIdx = n;

        while (my_str.length() > n) {

            word = my_str.substring(idx, endIdx);
            result.add(word);
            idx += n;
            endIdx += n;
            if (endIdx > my_str.length()) {
                break;
            }

        }

        if (my_str.substring(idx).length() > 0) {
            result.add(my_str.substring(idx));
        }

        return result.toArray(String[]::new);
    }
}
