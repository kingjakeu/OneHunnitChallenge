package medium;

import java.util.LinkedList;
import java.util.Queue;

public class Q79_WordSearch {
    class Solution {
        public boolean exist(char[][] board, String word) {
            char[] wordArr = word.toCharArray();
            int m = board.length;
            int n = board[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if(wordArr[0] == board[i][j]){
                        boolean[][] visited = new boolean[m][n];
                        visited[i][j] = true;
                        if(find(j, i, board, visited, wordArr, 1)) return true;
                    }
                }
            }
            return false;
        }
        public boolean find(int x, int y, char[][] board, boolean[][] visited, char[] word, int idx){
            if(word.length == idx){
                return true;
            }
            int yMax = board.length;
            int xMax = board[0].length;

            if(x - 1 >= 0 && word[idx] == board[y][x-1] && !visited[y][x-1]){
                visited[y][x-1] = true;
                if(find(x-1, y, board, visited, word, idx + 1)) return true;
                visited[y][x-1] = false;
            }
            if(y - 1 >= 0 && word[idx] == board[y-1][x] && !visited[y-1][x]){
                visited[y-1][x] = true;
                if(find(x, y-1, board, visited, word, idx + 1)) return true;
                visited[y-1][x] = false;
            }
            if(x + 1 < xMax && word[idx] == board[y][x+1] && !visited[y][x+1]){
                visited[y][x+1] = true;
                if(find(x+1, y, board, visited, word, idx + 1)) return true;
                visited[y][x+1] = false;
            }
            if(y + 1 < yMax && word[idx] == board[y+1][x] && !visited[y+1][x]){
                visited[y+1][x] = true;
                if(find(x, y+1, board, visited, word, idx + 1)) return true;
                visited[y+1][x] = false;
            }
            return false;
        }
    }
}
