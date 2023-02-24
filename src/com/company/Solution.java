package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new String[]{"2190 - -6344 = -8534", " - 5 + 66 = 61", "5 - 15 = 63", " - 3 - 0 = -3"})));
    }

    public String[] solution(String[] quiz) {

        List<String> result = new ArrayList<>();

        for (String s : quiz) {
            int[] temp = Arrays.stream(s.trim()
                                        .replace("- ", "-")
                                        .replace("--", "+ ")
                                        .replace("+ ", "")
                                        .replace("= ","")
                                        .split(" ")
                    ).mapToInt(Integer::parseInt).toArray();

            if (temp[0] + temp[1] == temp[2]) {
                result.add("O");
            } else {
                result.add("X");
            }
        }

        return result.toArray(String[]::new);
    }
}
