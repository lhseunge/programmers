package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(7, 10));
    }

    public int solution(int slice, int n) {

        double pizza = (double) n / slice;

        return (int) Math.ceil(pizza);
    }
}
