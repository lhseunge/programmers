package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {

        int[] numlist = {
                10000, 20, 36, 47, 40, 6, 10, 7000, 50, 10
        };

        System.out.println(Arrays.toString(new Solution().solution(numlist, 30)));
    }

    public int[] solution(int[] numlist, int n) {

        int[] answer = {};

        List<Integer> numList = Arrays.stream(numlist).boxed().sorted().collect(Collectors.toList());

        numList.sort((o1, o2) -> Math.abs(o2 - n) - Math.abs(o1 - n));

        Collections.reverse(numList);

        answer = numList.stream().mapToInt(x -> x).toArray();

        return answer;
    }
}
