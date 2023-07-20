package com.company;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[][] board = {
                // round 1
/*
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}

                // round 2
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0},
                {0, 0, 0, 0, 0}

                // round 3
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1}

                // round 4
                {0, 0, 0, 0, 1},
                {0, 1, 0, 1, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0}
*/

                // round 5
                {1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 1}
        };

        System.out.println(new Solution().solution(board));
    }

    public int solution(int[][] board) {

        int answer;
        int boardWidth = board.length;

        /*
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 0, 0, 0}
        */

        // 이중 반복문을 사용하여 주변 요소들에 대해 반복적으로 처리
        for (int i = 0; i < boardWidth; i++) {
            for (int j = 0; j < boardWidth; j++) {
                // 현재 요소가 1인 경우에만 처리
                if (board[i][j] == 1) {
                    // 인덱스 확인하여 경계를 벗어나지 않도록 처리
                    for (int row = Math.max(0, i - 1); row <= Math.min(boardWidth - 1, i + 1); row++) {
                        for (int col = Math.max(0, j - 1); col <= Math.min(boardWidth - 1, j + 1); col++) {
                            // 현재 요소가 1이면 1로, 그렇지 않으면 -1로 설정
                            board[row][col] = board[row][col] == 1 ? 1 : -1;
                        }
                    }
                }
            }
        }

        answer = (int) Arrays.stream(board)
                .flatMapToInt(Arrays::stream)
                .filter(x -> x == 0)
                .count();

        return answer;
    }

}
