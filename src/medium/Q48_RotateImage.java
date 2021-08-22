package medium;

public class Q48_RotateImage {
    static class Solution {
        public void rotate(int[][] matrix) {
            int n = matrix.length;
            int start = 0;
            while( n  > 1 ){
                subRotate(matrix, n, start);
                n -= 2;
                start +=1;
            }
        }
        public void subRotate(int[][] matrix, int n, int start){
            for (int i = 0; i < n-1; i++) {
                int x = start + i;
                int y = start;
                int dy = x;
                int dx = (n + start -1) - (y-start);
                int val = matrix[y][x];
                while(!(dy == start && dx == start +i)){
                    int tmp = matrix[dy][dx];
                    matrix[dy][dx] = val;
                    val = tmp;
                    x = dx;
                    y = dy;
                    dy = x;
                    dx = (n + start -1) - (y-start);
                }
                matrix[dy][dx] = val;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr ={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        Solution s = new Solution();
        s.rotate(arr);
        for(int[] a: arr){
            for (int i : a){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
