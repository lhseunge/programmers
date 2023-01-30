package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        System.out.println(new Solution().solution(".... . .-.. .-.. ---"));
    }

    public String solution(String letter) {

        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        StringBuilder sb = new StringBuilder();

        for (String l : letter.split(" ")) {
            for (int i = 0; i < morse.length; i++) {
                if (morse[i].equals(l)) {
                    sb.append(alphabet[i]);
                }
            }
        }

        return sb.toString();
    }
}
