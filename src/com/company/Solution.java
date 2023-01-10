package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder starTree = new StringBuilder("*");

        for(int i = 0; i < n; i++) {
            System.out.println(starTree);
            starTree.append("*");
        }
    }
}
