package leetcode.array

class CarPooling {
    fun carPooling(trips: Array<IntArray>, capacity: Int): Boolean {
        var count = IntArray(1001){0}
        var sum = 0

        for(trip in trips){
            count[trip[1]] += trip[0]
            count[trip[2]] -= trip[0]
        }

        for(i in count.indices){
            sum += count[i]
            if(sum > capacity){
                return false
            }
        }

        return true
    }
}