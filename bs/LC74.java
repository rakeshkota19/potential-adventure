package bs;

public class LC74 {
    public boolean searchMatrix(int[][] arr, int target) {
        int r = arr.length;

        if (r == 0)
            return false;

        int c = arr[0].length;
        int low = 0, high = r * c - 1;

        while (low <= high) {
            int mid = low + ( high - low) / 2;

            int row = mid / c;
            int col = mid % c;


            if (arr[row][col] == target) {
                return true;
            } else if (arr[row][col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return false;
    }
}
