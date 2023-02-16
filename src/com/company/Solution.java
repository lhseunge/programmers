package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(1,13, 1));
    }

    /**
     * i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.
     * @param i 시작 숫자
     * @param j 끝 숫자
     * @param k 타겟
     * @return
     */
    public int solution(int i, int j, int k) {

        int answer = 0;

        for (int idx = i; idx <= j; idx++) {
            for (String s : String.valueOf(idx).split("")) {
                if (s.equals(String.valueOf(k))) {
                    answer++;
                };
            }
        }

        return answer;
    }
}
