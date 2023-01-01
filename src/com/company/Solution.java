package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(150000));
    }

    public int solution(int price) {

        if (price >= 100000 && price < 300000) {
            return (int) (price - Math.floor(price * 0.05));
        } else if (price >= 300000 && price < 500000) {
            return (int) (price - Math.floor(price * 0.10));
        } else if (price >= 500000) {
            return (int) (price - Math.floor(price * 0.20));
        }
        return price;
    }
}
