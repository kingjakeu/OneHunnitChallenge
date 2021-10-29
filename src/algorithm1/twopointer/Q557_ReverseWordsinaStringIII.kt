package algorithm1.twopointer

class Q557_ReverseWordsinaStringIII {
    class Solution {
        fun reverseWords(s: String): String {
            val cArray = s.toCharArray()
            var left = 0
            for (idx in cArray.indices){
                if(cArray[idx] == ' '){
                    swap(cArray, left, idx - 1)
                    left = idx + 1
                }
            }
            swap(cArray, left, s.length - 1)
            return String(cArray)
        }
        fun swap(cArray: CharArray, left: Int, right: Int){
            var l = left
            var r = right
            while(left < right){
                val tmp = cArray[l]
                cArray[l++] = cArray[r]
                cArray[r--] = tmp
            }
        }
    }
}