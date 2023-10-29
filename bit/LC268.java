package bit;

public class LC268 {
    public int missingNumber(int[] arr) {
        int ans = 0;


        for(int i = 0 ; i < arr.length ; i++) {
            ans ^= arr[i];
            ans ^= (i+1);
        }

        return ans;
    }
}
