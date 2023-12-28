import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

       int[] num_list = {
                5, 2, 1, 7, 5
        };

        System.out.println(Arrays.toString(new Solution().solution(num_list, 3)));
    }

    public int[] solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            answer.add(num_list[i]);
        }

        return answer.stream().mapToInt(x->x).toArray();
    }

}
