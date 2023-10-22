package arrays;

public class LC238 {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] suffixArray = new int[len+1];
        int[] returnArray = new int[len];

        suffixArray[len] = 1;

        for (int i = len-1 ; i >= 0 ; i--)
            suffixArray[i] = suffixArray[i+1] * nums[i];

        int currVal = 1;
        for (int i = 0 ; i < len ; i++) {
            returnArray[i] = currVal * suffixArray[i+1];
            currVal *= nums[i];
        }

        return returnArray;
    }
}
