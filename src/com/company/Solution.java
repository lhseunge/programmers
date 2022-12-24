package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 2, 3}));
    }

    public int solution(int[] sides) {

        Arrays.sort(sides);

        if(sides[0] + sides[1] > sides[2]) {
            return 1;
        } else {
            return 2;
        }
    }
}
