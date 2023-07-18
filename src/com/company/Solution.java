package com.company;

public class Solution {

    public static void main(String[] args) {

        System.out.println(new Solution().solution("abca", "aabc"));
    }

    public int solution(String A, String B) {

        if (A.equals(B)) {
            return 0;
        }

        for (int i = 1; i <= A.length(); i++) {

            A = A.split("")[A.length() - 1].concat(A).substring(0, A.length());

            if (A.equals(B)) {
                return i;
            }
        }

        return -1;

    }
}
