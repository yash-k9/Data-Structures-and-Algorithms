package leetcode.strings

class ReverseWordsInAStringIII {

    fun reverseWords(s: String): String {
        if(s.length <= 1) return s

        val res = s.toCharArray()
        var i = 0
        while(i < res.size){
            if(res[i] != ' '){
                var j = i
                while(j+1 < res.size && res[j] != ' '){ j += 1 }
                reverseString(res, i, j)
                i = j
            }
           i += 1
        }

        return String(res)
    }

    fun reverseString(word: CharArray, i: Int, j: Int){
        var start = i; var end = j

        while(start < end){
            var temp = word[start]
            word[start] = word[end]
            word[end] = temp
            start++
            end--
        }
    }
}