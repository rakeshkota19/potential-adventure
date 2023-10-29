package bs;

public class LC875 {
    boolean canEat(int []arr, int h, int k) {
        int current = 0;
        for (int i = 0 ; i < arr.length ; i++) {

            if (arr[i] % k != 0)
                current++;

            current += arr[i] / k;

            if (current > h)
                return false;
        }

        return true;
    }

    public int minEatingSpeed(int[] arr, int h) {
        int low = 1, high = Integer.MAX_VALUE,mid;
        int ans = 0;

        for (int i = 0 ; i < arr.length ; i++)
            high = Math.max(arr[i], high);

        ans = high;
        while (low <= high) {
            mid = low + (high - low)/2;

            if (canEat(arr,h,mid)) {
                ans = Math.min(mid, ans);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
