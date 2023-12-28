public class Solution {

    public static void main(String[] args) {

        String[] babbling1 = {
                "aya",
                "yee",
                "u",
                "maa",
                "wyeoo"
        };

        String[] babbling2 = {
                "ayaye",
                "uuuma",
                "ye",
                "yemawoo",
                "ayaa"
        };

        System.out.println(new Solution().solution(babbling1));
    }

    public int solution(String[] babbling) {
        int answer = 0;

        String[] accents = {
                "aya",
                "ye",
                "woo",
                "ma"
        };

        for (String b : babbling) {
            for (String accent : accents) {
                b = b.replace(accent, " ");
            }
            System.out.println(b);
            if (b.isBlank()) {
                answer++;
            }
        }

        return answer;
    }

}
