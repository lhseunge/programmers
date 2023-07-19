package com.company;

public class Solution {

    public static void main(String[] args) {

        int[] common = {
//                1, 2, 3, 4
                2, 4, 8
//                2, 4, 8
        };

        System.out.println(new Solution().solution(common));
    }

    public int solution(int[] common) {

        int temp1 = common[common.length - 1] - common[common.length - 2];
        int temp2 = common[common.length - 2] - common[common.length - 3];

        if (temp1 == temp2) {

            return common[common.length - 1] + temp1;

        } else {

            return common[common.length - 1] + (temp1 / temp2) * temp1;
        }
    }
}
