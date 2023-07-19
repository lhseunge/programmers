package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {

        System.out.println(new Solution().solution("x + x + 7"));
    }

    public String solution(String polynomial) {
        String answer = "";

        List<String> splitPolynomial = Arrays.stream(polynomial.split(" [+] ")).collect(Collectors.toList());


        int vars = splitPolynomial.stream()
                .filter(term -> term.contains("x") && !term.equals("x"))
                .map(term -> term.replace("x", ""))
                .mapToInt(Integer::parseInt)
                .sum();

        int onlyVars = (int) splitPolynomial.stream()
                .filter(term -> term.equals("x"))
                .count();


        int constant = splitPolynomial.stream()
                .filter(term -> !term.contains("x"))
                .mapToInt(Integer::parseInt)
                .sum();

        String varSum = vars + onlyVars == 1 ? "x" : (vars + onlyVars)+"x";

        if (vars + onlyVars > 0 && constant > 0) {
            answer = varSum + " + " + constant;
        } else if (vars + onlyVars > 0) {
            answer = varSum;
        } else if (constant > 0) {
            answer = "" + constant;
        }


        return answer;
    }
}
