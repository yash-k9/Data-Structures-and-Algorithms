package leetcode.twopointers

class ReverseArray {
    fun reverse(nums: IntArray, start: Int, end: Int){
        var start = start; var end = end

        while(start < end){
            val temp = nums[start]
            nums[start] = nums[end]
            nums[end] = temp
            start += 1
            end -= 1
        }
    }
}