package graphs;

import java.util.LinkedList;
import java.util.Queue;


class Pair{
    int row;
    int col;
    int time;

    Pair(int row, int col, int time) {
        this.row = row;
        this.col = col;
        this.time = time;
    }
}

public class LC994 {
    private boolean isSafe(int x, int y, int rowSz, int colSz) {
        return x >= 0 && y >= 0 && x < rowSz && y < colSz;
    }

    public int orangesRotting(int[][] arr) {
        int rowSz = arr.length;
        if (rowSz == 0)
            return 0;

        int colSz = arr[0].length;
        boolean[][] vis = new boolean[rowSz][colSz];
        int ans = 0, count = 0;

        Queue<Pair> q = new LinkedList<>();
        for (int i = 0 ; i < rowSz ; i++) {
            for (int j = 0 ; j < colSz ; j++) {

                if (arr[i][j] == 2)
                    q.add(new Pair(i, j, 0));

                if (arr[i][j] == 1)
                    count++;
            }
        }

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            if (!isSafe(curr.row, curr.col, rowSz, colSz) || arr[curr.row][curr.col] == 0 || vis[curr.row][curr.col])
                continue;

            if (arr[curr.row][curr.col] == 1){
                count--;
                ans = Math.max(ans, curr.time);
            }

            vis[curr.row][curr.col] = true;
            q.add(new Pair(curr.row + 1, curr.col, curr.time+1));
            q.add(new Pair(curr.row-1, curr.col, curr.time+1));
            q.add(new Pair(curr.row, curr.col + 1, curr.time+1));
            q.add(new Pair(curr.row, curr.col - 1, curr.time+1));
        }



        return count == 0 ? ans : -1;
    }

}
