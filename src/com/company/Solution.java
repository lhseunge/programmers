package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Solution().solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)));
    }

    public int[][] solution(int[] num_list, int n) {

        int[][] answer = new int[num_list.length / n][n];
        List<Integer> nums = Arrays.stream(num_list).boxed().collect(Collectors.toList());

        for (int j = 0; j < num_list.length / n; j++) {
            for (int k = 0; k < n; k++) {
                answer[j][k] = nums.get(0);
                nums.remove(0);
            }
        }

        return answer;
    }
}
