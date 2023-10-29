package arrays;

public class LC73 {
    public void setZeroes(int[][] arr) {
        int rowSz = arr.length;
        if (rowSz == 0)
            return;

        int colSz = arr[0].length;
        int[] rows = new int[rowSz];
        int[] cols = new int[colSz];

        for (int i = 0 ; i < rowSz ; i++) {
            for (int j = 0 ; j < colSz ; j++) {

                if (arr[i][j] == 0) {
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }


        for(int i = 0 ; i < rowSz ; i++) {
            for(int j = 0 ; j < colSz ; j++) {
                if (cols[j] == 1 || rows[i] == 1)
                    arr[i][j] = 0;
            }
        }
    }
}
