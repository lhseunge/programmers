package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(29183, 1));
    }

    public int solution(int num, int k) {

        String StringNum = String.valueOf(num);
        String StringK = String.valueOf(k);

        if (!String.valueOf(num).contains(StringK))
            return -1;

        String[] numCharArray = String.valueOf(num).split("");

        for (int i = 0; i < StringNum.length(); i++) {
            if (numCharArray[i].equalsIgnoreCase(StringK)) return i + 1;
        }

        return 0;
    }
}
