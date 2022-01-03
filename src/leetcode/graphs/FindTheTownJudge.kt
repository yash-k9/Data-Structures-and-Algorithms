package leetcode.graphs

class FindTheTownJudge {
    fun findJudge(n: Int, trust: Array<IntArray>): Int {
        val res = IntArray(n+1)

        for(arr in trust){
            val p1 = arr[0]
            val p2 = arr[1]

            res[p1] -= 1
            res[p2] += 1
        }

        for(i in 1 until res.size){
            if(res[i] == n-1){
                return i
            }
        }

        return -1
    }
}