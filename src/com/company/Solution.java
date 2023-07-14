package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {

        int[][] dots = {
                {-1, -1},
                {1, 1},
                {1, -1},
                {-1, 1}


        };
        System.out.println(new Solution().solution(dots));
    }

    public int solution(int[][] dots) {

        int answer = 0;

        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();

        for (int[] dot : dots) {

            xList.add(dot[0]);
            yList.add(dot[1]);

        }

        int maxX = xList.stream().mapToInt(x -> x).max().getAsInt();
        int minX = xList.stream().mapToInt(x -> x).min().getAsInt();

        int maxY = yList.stream().mapToInt(y -> y).max().getAsInt();
        int minY = yList.stream().mapToInt(y -> y).min().getAsInt();

        answer = (maxX - minX) * (maxY - minY);

        return answer;
    }
}
