package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[]{"meosseugi", "1234"}, new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "12345"}}));
    }

    public String solution(String[] id_pw, String[][] db) {

        for (String[] strings : db) {
            if (strings[0].equals(id_pw[0])) {
                if (strings[1].equals(id_pw[1])) return "login";
                else return "wrong pw";
            }

        }

        return "fail";
    }
}
