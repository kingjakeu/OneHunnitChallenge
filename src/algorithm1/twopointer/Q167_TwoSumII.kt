package algorithm1.twopointer

class Q167_TwoSumII {
    class Solution {
        fun twoSum(numbers: IntArray, target: Int): IntArray {
            var left = 0
            var right = numbers.size - 1

            while (left < right) {
                var sum = numbers[left] + numbers[right]
                if(sum == target) return intArrayOf(left + 1, right + 1)

                if(sum < target){
                    left += 1
                }else{
                    right -= 1
                }
            }
            return IntArray(2)
        }
    }
}