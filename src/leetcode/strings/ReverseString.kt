package leetcode.strings

class ReverseString {
    fun reverseString(s: CharArray): Unit {
        if(s.size <= 1) return

        var start = 0; var end = s.size - 1

        while(start < end){
            var temp = s[start]
            s[start] = s[end]
            s[end] = temp
            start++
            end--
        }
    }
}