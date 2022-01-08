package leetcode.backtracking

class palindromePartitioning {
    fun partition(s: String): List<List<String>> {
        var res = arrayListOf<ArrayList<String>>()
        if(s.length == 0) return res

        partitionString(s, 0, res, arrayListOf<String>())

        return res
    }

    private fun partitionString(
        s: String,
        index: Int,
        res: MutableList<ArrayList<String>>,
        temp: MutableList<String>
    ) {
        if(index >= s.length){
            res.add(ArrayList(temp))
            return
        }

        for(i in index until s.length){
            if(isPalindrome(s, index, i)){
                temp.add(s.substring(index, i+1))
                partitionString(s, index+1, res, temp)
                temp.removeAt(temp.size - 1)
            }
        }
    }

    fun isPalindrome(s: String, left: Int, right:Int): Boolean{
        var left = left
        var right = right
        while(left < right){
            if(s[left] != s[right]){
                return false
            }
            left++
            right--
        }

        return true
    }
}