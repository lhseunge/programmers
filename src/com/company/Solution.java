public class Solution {

    public static void main(String[] args) {

        int[][] lines = {
                {1, 4},
                {9, 2},
                {3, 8},
                {11, 6}
        };

        int[][] lines2 = {
                {3, 5},
                {4, 1},
                {2, 4},
                {5, 10}
        };

        System.out.println(new Solution().solution(lines));
    }

    public int solution(int[][] lines) {
        int answer = 0;

        int x1 = lines[0][0];
        int y1 = lines[0][1];
        int x2 = lines[1][0];
        int y2 = lines[1][1];
        int x3 = lines[2][0];
        int y3 = lines[2][1];
        int x4 = lines[3][0];
        int y4 = lines[3][1];

        // 선분 별 각각의 기울기 계산

        double slopeCase1 = Math.abs((double) (y1 - y2) / (x1 - x2));
        double slopeCase2 = Math.abs((double) (y3 - y4) / (x3 - x4));
        if (slopeCase1 == slopeCase2) {
            return 1;
        }

        double slopeCase3 = Math.abs((double) (y1 - y3) / (x1 - x3));
        double slopeCase4 = Math.abs((double) (y2 - y4) / (x2 - x4));
        if (slopeCase3 == slopeCase4) {
            return 1;
        }

        double slopeCase5 = Math.abs((double) (y1 - y4) / (x1 - x4));
        double slopeCase6 = Math.abs((double) (y2 - y3) / (x2 - x3));
        if (slopeCase5 == slopeCase6) {
            return 1;
        }

        System.out.println("slopeCase1 = " + slopeCase1);
        System.out.println("slopeCase2 = " + slopeCase2);
        System.out.println("slopeCase3 = " + slopeCase3);
        System.out.println("slopeCase4 = " + slopeCase4);
        System.out.println("slopeCase5 = " + slopeCase5);
        System.out.println("slopeCase6 = " + slopeCase6);

        return answer;
    }

}
