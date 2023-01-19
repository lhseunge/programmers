package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(51));
    }

    public String solution(int age) {

        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        StringBuilder answerBuilder = new StringBuilder();

        String[] ageArray = String.valueOf(age).split("");

        for (String s : ageArray) {
            answerBuilder.append(alphabet[Integer.parseInt(s)]);
        }

        return answerBuilder.toString();
    }
}
