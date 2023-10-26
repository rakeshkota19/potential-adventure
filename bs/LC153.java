package bs;

public class LC153 {
    public int findMin(int[] arr) {
        int len = arr.length;
        if (len == 0)
            return -1;

        int ans = arr[0];
        int low = 0, high = arr.length - 1, mid;

        // not rotated case
        if (arr[low] < arr[high])
            return arr[low];

        while (low <= high) {
            mid = low + ( high - low ) / 2;

            // still increassing seq go right
            if (arr[mid] >= arr[0]) {
                low = mid + 1;
            } else {
                high = mid - 1;
                ans = Math.min(ans, arr[mid]);
            }
        }

        return ans;
    }
}
