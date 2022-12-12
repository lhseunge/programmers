package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new String[]{"We", "are", "the", "world!"})));
    }

    public int[] solution(String[] strlist) {

        List<Integer> answers = new ArrayList<>();

        for (String s : strlist) {
            answers.add(s.length());
        }

        int[] answer = answers.stream().mapToInt(x->x).toArray();
        return answer;
    }
}
