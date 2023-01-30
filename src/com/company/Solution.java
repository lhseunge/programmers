package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new int[]{1,100,2,88,99})));
    }

    public int[] solution(int[] emergency) {


        int[] emergencyRank = new int[emergency.length];
        int[] sortedEmergency = Arrays.stream(emergency).boxed().collect(Collectors.toList()).stream().sorted(Collections.reverseOrder()).mapToInt(x->x).toArray();

        int rank = 1;

        for (int i = 0; i < emergency.length; i++) {
            for (int  j = 0; j < emergency.length; j++) {

                if (sortedEmergency[i] == emergency[j]) {
                    emergencyRank[j] = rank;
                    rank++;
                    break;
                }
            }

        }

        return emergencyRank;
    }
}
