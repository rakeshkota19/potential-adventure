package dp;

public class LC70 {
    public int climbStairs(int n) {
        if (n <= 2)
            return n;

        int left1 = 1;
        int left2 = 2;
        int ans = 2;

        for(int i = 2 ; i < n ; i++) {
            ans = left1 + left2;
            left1 = left2;
            left2 = ans;
        }

        return ans;
    }
}
