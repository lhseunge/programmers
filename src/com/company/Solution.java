package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution("3 + 4 - 1"));
    }

    public int solution(String my_string) {
        int answer = 0;

        String[] my_stringArray = my_string.split(" ");

        for (int i = 0; i < my_stringArray.length; i++) {

            if (my_stringArray[i].equals("+")) {
                answer += Integer.parseInt(my_stringArray[i + 1]);
                i++;
            } else if (my_stringArray[i].equals("-")) {
                answer -= Integer.parseInt(my_stringArray[i + 1]);
                i++;
            } else {
                answer += Integer.parseInt(my_stringArray[i]);
            }
        }

        return answer;
    }
}
