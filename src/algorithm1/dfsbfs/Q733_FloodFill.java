package algorithm1.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;

public class Q733_FloodFill {
    class Solution {
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            int height = image.length;
            int width = image[0].length;
            boolean[][] visited = new boolean[height][width];

            Queue<Cell> cellQueue = new LinkedList<>();
            cellQueue.add(new Cell(sr, sc));
            int[][] offset = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
            int oldColor = image[sr][sc];

            while(!cellQueue.isEmpty()){
                Cell cell = cellQueue.poll();
                visited[cell.y][cell.x] = true;
                image[cell.y][cell.x] = newColor;

                for (int i = 0; i < 4; i++) {
                    int dy = cell.y + offset[i][0];
                    int dx = cell.x + offset[i][1];
                    if(dy >= 0 && dy < height && dx >= 0 && dx < width){
                        if(!visited[dy][dx]){
                            if(image[dy][dx] == oldColor){
                                cellQueue.add(new Cell(dy, dx));
                            }
                        }
                    }
                }
            }
            return image;
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
