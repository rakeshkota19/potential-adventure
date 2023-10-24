package arrays;

public class LC167 {
    public int[] twoSum(int[] arr, int target) {
        int low = 0, high = arr.length -  1;

        while (low <= high) {
            int tmp = arr[low] + arr[high];

            if (tmp == target) {
                return new int[]{low+1, high+1};
            } else if (tmp > target)
                high--;
            else
                low++;
        }

        return new int[]{-1,-1};
    }
}
