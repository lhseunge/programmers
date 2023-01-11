package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 1}));
    }

    public int solution(int[] array) {

        if (array.length == 1) {
            return array[0];
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] distinctArray = Arrays.stream(array).distinct().toArray();

        for (int i : distinctArray) {
            map.put(i, (int) Arrays.stream(array).filter(x-> x == i).count());

        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());

        entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        if(entryList.size() == 1) {
            return entryList.get(0).getKey();
        }

        if(entryList.get(0).getValue() == entryList.get(1).getValue()) {
            return -1;
        }

        return entryList.get(0).getKey();

    }
}
