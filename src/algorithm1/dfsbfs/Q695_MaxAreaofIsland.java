package algorithm1.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;

public class Q695_MaxAreaofIsland {
    class Solution {
        public int maxAreaOfIsland(int[][] grid) {
            int height = grid.length;
            int width = grid[0].length;

            boolean[][] visited = new boolean[height][width];
            int answer = 0;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if(grid[i][j] == 1 && !visited[i][j]){
                        answer = Math.max(find(grid, visited, i, j, 1), answer);
                    }
                }
            }


            return answer;
        }
        public int find(int[][] grid, boolean[][] visited, int y, int x, int count){
            visited[y][x] = true;
            int[][] offset = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
            for (int i = 0; i < 4; i++) {
                int dy = y + offset[i][0];
                int dx = x + offset[i][1];
                if(dy >= 0 && dy < grid.length && dx >= 0 && dx < grid[0].length){
                    if(!visited[dy][dx] && grid[dy][dx] == 1){
                        count = Math.max(find(grid, visited, dy, dx, count + 1) ,count);
                    }
                }
            }
            return count;
        }
    }
    class Cell{
        int y;
        int x;
        Cell(int y, int x){
            this.y = y;
            this.x = x;
        }
    }
}
