package leetcode.array

import kotlin.math.abs

class FindAllNumbersDisappearedInAnArray {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val res = mutableListOf<Int>()

        for(i in nums.indices){
            var curr = abs(nums[i])
            nums[curr-1] = -(abs(nums[curr-1]))
        }

        for(i in nums.indices){
            if(nums[i] > 0) res.add(i+1)
        }

        return res
    }
}