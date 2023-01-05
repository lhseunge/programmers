package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(2,1,20));
    }

    /**
     * a : 콜라를 받으려면 마트에 줘야하는 병 수
     * b : 빈 병 a개를 가져다 주면 마트가 주는 콜라 병 수
     * c : 상빈이가 가지고 있는 빈 병의 수
     */
    public int solution(int a, int b, int n) {

        List<Integer> calc = new ArrayList<>() ;

        while (n >= a) {
            calc.add(n);
            n = n - a + b;
        }

        return calc.size() * b;

    }
}
