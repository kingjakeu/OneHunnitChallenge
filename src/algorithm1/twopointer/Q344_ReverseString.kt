package algorithm1.twopointer

class Q344_ReverseString {
    class Solution {
        fun reverseString(s: CharArray): Unit {
            var left  = 0
            var right = s.size - 1
            while (left < right){
                var tmp = s[left]
                s[left++] = s[right]
                s[right--] = tmp
            }
        }
    }
}
