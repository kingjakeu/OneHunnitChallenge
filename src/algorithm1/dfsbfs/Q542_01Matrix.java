package algorithm1.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;

public class Q542_01Matrix {
    class Solution {
        public int[][] updateMatrix(int[][] mat) {
            int height = mat.length;
            int width = mat[0].length;

            boolean[][] visited = new boolean[height][width];
            Queue<Dot> que = new LinkedList<>();

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if(mat[i][j] == 0){
                        visited[i][j] = true;
                        que.add(new Dot(i, j));
                    }
                }
            }

            int[][] offset = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
            while(!que.isEmpty()){
                Dot dot = que.poll();
                for (int i = 0; i < 4; i++) {
                    int dy = dot.y + offset[i][0];
                    int dx = dot.x + offset[i][1];
                    if(dy >= 0 && dy < mat.length && dx >= 0 && dx < mat[0].length){
                        if(!visited[dy][dx]){
                            visited[dy][dx] = true;
                            if(mat[dy][dx] == 0){
                                mat[dy][dx] = mat[dot.y][dot.x];
                            }else{
                                mat[dy][dx] = mat[dot.y][dot.x] + 1;
                            }
                            que.add(new Dot(dy, dx));
                        }
                    }
                }
            }
            return mat;
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
