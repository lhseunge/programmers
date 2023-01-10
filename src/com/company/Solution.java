package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(999));
    }

    public int solution(int hp) {

        int answer = 0;
        int atkCnt = 0;

        while(hp != 0) {
            if (hp >= 5) {
                atkCnt = atkGeneral(hp);
                hp -= atkCnt * 5;
                answer += atkCnt;
                continue;
            }
            if (hp >= 3) {
                atkCnt = atkSoldier(hp);
                hp -= atkCnt * 3;
                answer += atkCnt;
                continue;
            }
            if (hp >= 1) {
                hp = atkWorker(hp);
                answer++;
                continue;
            }
        }

        return answer;
    }

    public int atkGeneral(int hp) {
        return hp / 5;
    }

    public int atkSoldier(int hp) {
        return hp / 3;
    }

    public int atkWorker(int hp) {
        return hp - 1;
    }
}
