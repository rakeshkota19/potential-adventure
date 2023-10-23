package bit;

public class LC136 {
    public int singleNumber(int[] arr) {
        int ans = 0;

        for(int num:arr)
            ans ^= num;

        return ans;
    }
}
