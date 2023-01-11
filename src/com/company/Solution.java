package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[] {10, 8, 6}, 3));
    }

    public int solution(int[] box, int n) {

        int x = box[0] / n;
        int y = box[1] / n;
        int z = box[2] / n;

        return x * y * z;
    }
}
