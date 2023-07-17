package com.company;

public class Solution {

    public static void main(String[] args) {
        
        System.out.println(new Solution().solution(1081));
    }

    public int solution(int chicken) {
        // 서비스 치킨
        int answer = 0;

        // 치킨 1마리를 주문하면 쿠폰 한장 발행
        int publishCoupon = chicken;

        while (publishCoupon >= 10) {
            // 서비스 받은 치킨 : 발행 쿠폰 / 10
            answer += publishCoupon / 10;

            // 쿠폰 발행 후 남은 쿠폰 개수 확인
            int remainCoupon = publishCoupon % 10;

            // 쿠폰 사용 처리
            publishCoupon /= 10;

            // 남은 쿠폰 반영
            publishCoupon += remainCoupon;
        }

        return answer;
    }
}
