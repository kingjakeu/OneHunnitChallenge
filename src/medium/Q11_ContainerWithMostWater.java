package medium;

public class Q11_ContainerWithMostWater {
    class Solution {
        public int maxArea(int[] height) {
            int length = height.length;
            int start = 0;
            int end = length -1;
            int max = 0;
            while(start < end){
                max = Math.max(max, Math.min(height[start], height[end]) * (end - start));
                if(height[start] < height[end]) {
                    start += 1;
                }else{
                    end -= 1;
                }
            }
            return max;
        }
    }
}
