package leetcode.twoPointers

class MoveZeroes {
    fun moveZeroes(nums: IntArray): Unit {
        if(nums.size <= 1) return

        var pos = 0; var start = 0
        while(start < nums.size -1){
            if(nums[start] != 0){
                swapNums(nums, start, pos)
                start++
            }
        }
    }

    fun swapNums(nums: IntArray, pos1: Int, pos2: Int){
        var temp = nums[pos1]
        nums[pos1] = nums[pos2]
        nums[pos2] = temp
    }
}