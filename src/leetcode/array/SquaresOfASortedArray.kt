package leetcode.array

import kotlin.math.abs

class SquaresOfASortedArray {
    fun sortedSquares(nums: IntArray): IntArray {
        var start = 0; var end = nums.size - 1; var k = nums.size - 1
        val res = IntArray(nums.size)

        while(start <= end){
            val n1 = abs(nums[start])
            val n2 = abs(nums[end])

            if(n1 >= n2){
                res[k] = n1 * n1
                start += 1
            }else{
                res[k] = n2 * n2
                end -= 1
            }

            k--
        }

        return res
    }
}