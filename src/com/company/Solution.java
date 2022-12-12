package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1,2}));
    }

    public int solution(int[] dot) {

        if (dot[0] > 0 && dot[1] > 0) {
            return 1;
        } else if (dot[0] < 0 && dot[1] > 0) {
            return 2;
        } else if (dot[0] < 0 && dot[1] < 0) {
            return 3;
        } else if (dot[0] > 0 && dot[1] < 0) {
            return 4;
        }
        return 0;
    }
}
