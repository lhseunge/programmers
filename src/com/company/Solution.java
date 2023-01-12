package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(10));
    }

    public int solution(int n) {

        int piece = 6;
        int pizza = 1;

        while ((pizza * piece) % n != 0) {

            pizza++;
        }
        
        return pizza;
    }

}
