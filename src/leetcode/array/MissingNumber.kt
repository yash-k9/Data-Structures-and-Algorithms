package leetcode.array

class MissingNumber {
    fun missingNumber(nums: IntArray): Int {
        var res = 0

        for(i in nums.indices){
            res = res xor nums[i]
        }

        for(i in 0..nums.size){
            res = res xor i
        }

        return res
    }
}