package graphs;

import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int row;
    int col;

    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

public class LC200 {
    private boolean isSafe(int x, int y, int rowSz, int colSz) {
        return x >= 0 && y >= 0 && x < rowSz && y < colSz;
    }

    public int numIslands(char[][] arr) {
        int rowSz = arr.length;
        if (rowSz == 0)
            return 0;

        int colSz = arr[0].length;
        boolean[][] vis = new boolean[rowSz][colSz];
        int ans = 0;

        for (int i = 0 ; i < rowSz ; i++) {
            for (int j = 0 ; j < colSz ; j++) {

                if (arr[i][j] == '0' || vis[i][j])
                    continue;

                ans++;
                Queue<Pair> q = new LinkedList<>();
                q.add(new Pair(i, j));

                while(!q.isEmpty()) {
                    Pair curr = q.poll();
                    int currX = curr.row, currY = curr.col;

                    if (!isSafe(currX, currY, rowSz, colSz))
                        continue;

                    if (vis[currX][currY] || arr[currX][currY] == '0')
                        continue;

                    vis[currX][currY] = true;
                    q.add(new Pair(currX, currY+1));
                    q.add(new Pair(currX, currY-1));
                    q.add(new Pair(currX+1, currY));
                    q.add(new Pair(currX-1, currY));
                }
            }
        }

        return ans;
    }
}
