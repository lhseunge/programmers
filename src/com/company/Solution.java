package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(144));
    }

    public int solution(int n) {

        if (n % Math.sqrt(n) == 0) {
            return 1;
        }

        return 2;
    }
}
