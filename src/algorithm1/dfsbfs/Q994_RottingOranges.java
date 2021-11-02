package algorithm1.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;

public class Q994_RottingOranges {
    class Solution {
        public int orangesRotting(int[][] grid) {
            int height = grid.length;
            int width = grid[0].length;
            boolean[][] visited = new boolean[height][width];

            int freshCount = 0;

            Queue<Dot> que = new LinkedList<>();
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if(grid[i][j] == 1) {
                        freshCount += 1;
                    }else if(grid[i][j] == 2){
                        visited[i][j] = true;
                        que.add(new Dot(i, j));
                    }
                }
            }

            int count = 0;
            int[][] offset = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

            Queue<Dot> newQueue = new LinkedList<>();

            int changedCount = 0;
            while(!que.isEmpty()){
                Dot dot = que.poll();
                for (int i = 0; i < 4; i++) {
                    int dy = dot.y + offset[i][0];
                    int dx = dot.x + offset[i][1];
                    if(dy >= 0 && dy < height && dx >= 0 && dx < width){
                        if(!visited[dy][dx] && grid[dy][dx] == 1){
                            changedCount += 1;
                            visited[dy][dx] = true;
                            grid[dy][dx] = 2;
                            newQueue.add(new Dot(dy, dx));
                        }
                    }
                }
                if(que.isEmpty() && !newQueue.isEmpty()){
                    count += 1;
                    que = newQueue;
                    newQueue = new LinkedList<>();
                }
            }

            if(freshCount == changedCount) return count;

            return -1;
        }
    }
    class Dot{
        int y;
        int x;
        Dot(int y, int x){
            this.y = y;
            this.x = x;
        }
    }
}
