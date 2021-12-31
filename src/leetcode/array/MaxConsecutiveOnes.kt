package leetcode.array

class MaxConsecutiveOnes {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        if(nums.isEmpty()) return 0

        var res = 0; var count = 0
        for(i in nums.indices){
            if(nums[i] == 0){
                res = Math.max(res, count)
                count = 0
            }else{
                count += 1
            }
        }

        return Math.max(res, count)
    }
}