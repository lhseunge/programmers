package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(15000)));
    }

    public int[] solution(int money) {

        int coffePrice = 5500;
        int cupOfCoffee = money / coffePrice;

        int exchange = money - cupOfCoffee * coffePrice;

        return new int[]{cupOfCoffee, exchange};
    }
}
