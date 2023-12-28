import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        System.out.println(new Solution().solution());
    }

    public String solution() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        return str.repeat(n);
    }

}
