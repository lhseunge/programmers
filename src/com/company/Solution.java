package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    /**
     * 영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다.
     * 영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.
     *
     * 제한사항
     * 0 ≤ score[0], score[1] ≤ 100
     * 1 ≤ score의 길이 ≤ 10
     * score의 원소 길이는 2입니다.
     * score는 중복된 원소를 갖지 않습니다.
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new int[][]{{1,2}, {1,1}, {1,1}, {1,1}})));
    }

    public int[] solution(int[][] score) {

        float[] scoreArray = new float[score.length];

        for (int i = 0; i < score.length; i++) {

            scoreArray[i] = (float) (score[i][0] + score[i][1]) / 2;
        }

        int[] rankArray = new int[score.length];

        for(int i = 0; i < scoreArray.length; i++) {
            rankArray[i] = 1;
            for(int j = 0; j < scoreArray.length; j++) {
                if(scoreArray[i] < scoreArray[j]) {
                    rankArray[i]++;
                }
            }
        }

        int[] answer = rankArray;
        return answer;
    }
}
