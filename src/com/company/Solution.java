package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 2, 3, 4, 5}));
    }

    public int solution(int[] numbers) {

        Integer[] result = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(result, Collections.reverseOrder());

        return result[0] * result[1];
    }
}
