package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[]{"p", "o", "s"},	new String[]{"sod", "eocd", "qixm", "adio", "soo", "sop"}));
    }

    public int solution(String[] spell, String[] dic) {

        String word = Arrays.stream(spell).sorted().collect(Collectors.joining());

        for (int i = 0; i < dic.length; i++) {
            dic[i] = Arrays.stream(dic[i].split("")).sorted().collect(Collectors.joining());

            if (dic[i].equals(word)) {
                return 1;
            }
        }

        return 2;
    }
}
