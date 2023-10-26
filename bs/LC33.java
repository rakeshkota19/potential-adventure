package bs;

public class LC33 {
    int binarySearch(int arr[], int low, int high, int target) {
        while (low <= high) {
            int mid = low + ( high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return -1;
    }

    public int search(int[] arr, int target) {
        int len = arr.length;
        if (len == 0)
            return -1;

        int ans = len-1;
        int low = 0, high = arr.length - 1, mid;

        if (arr[0] == target)
            return 0;

        // not rotated case
        if (arr[low] < arr[high])
            ans = 0;
        else {
            while (low <= high) {
                mid = low + ( high - low ) / 2;

                // still increassing seq go right
                if (arr[mid] >= arr[0]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                    ans = Math.min(ans, mid);
                }
            }
        }

        if (arr[0] > target || ans == 0)
            return binarySearch(arr, ans,  len-1, target);
        else
            return binarySearch(arr, 0, ans-1, target);

    }
}
