package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new String[]{"left", "left", "left", "left", "right", "right", "right", "right"}, new int[]{5, 5})));
    }

    public int[] solution(String[] keyinput, int[] board) {

        int[] cordinate = {0,0};

        if (Arrays.equals(board, new int[]{1, 1})) return cordinate;

        int maxX = (board[0] - 1) / 2;
        int maxY = (board[1] - 1) / 2;

        for (String s : keyinput) {
            switch (s) {
                case "left":
                    cordinate[0] -= 1;
                    setOverRangeCordinateToMaxCordinate(cordinate, maxX, maxY);
                    break;
                case "right":
                    cordinate[0] += 1;
                    setOverRangeCordinateToMaxCordinate(cordinate, maxX, maxY);
                    break;
                case "up":
                    cordinate[1] += 1;
                    setOverRangeCordinateToMaxCordinate(cordinate, maxX, maxY);
                    break;
                case "down":
                    cordinate[1] -= 1;
                    setOverRangeCordinateToMaxCordinate(cordinate, maxX, maxY);
                    break;
            }
        }

        return cordinate;
    }

    private int[] setOverRangeCordinateToMaxCordinate(int[] cordinate, int maxX, int maxY) {

        if (cordinate[0] > maxX) {
            cordinate[0] = maxX;
        } else if (cordinate[0] < maxX * -1) {
            cordinate[0] = maxX * -1;
        }

        if (cordinate[1] < maxY * -1 ) {
            cordinate[1] = maxY * -1;
        }
        else if (cordinate[1] > maxY) {
            cordinate[1] = maxY;
        }

        return cordinate;

    }
}
