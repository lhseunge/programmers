package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {

        int[][] lines = {
                {0, 5}, {3, 9}, {1, 10}
        };


        /*
        0, 1
              2, 3, 4, 5
                 3, 4, 5, 6, 7, 8, 9
        */

        /*
        -1, 0, 1
               1, 2, 3
                     3, 4, 5, 6, 7, 8, 9
        */

        /*
        0, 1, 2, 3, 4, 5
           1, 2, 3, 4, 5, 6, 7, 8, 9 ,10
                 3, 4, 5, 6, 7, 8, 9
        */

        System.out.println(new Solution().solution(lines));
    }

    public int solution(int[][] lines) {
        
        int answer = 0;

        int[] rail = new int[200];
        for (int[] line : lines) {
            for (int j = (line[0] + 100); j < (line[1] + 100); j++) {
                rail[j]++;
            }
        }

        for (int value : rail) {
            if (value > 1) answer++;
        }
        
        return answer;

    }

}
