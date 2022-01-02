package leetcode.twoPointers

class RotateArray {
    fun rotate(nums: IntArray, k: Int): Unit {
        if((nums.size <= 1) or (k % nums.size == 0)) return

        val n = nums.size - 1
        val rot = k % nums.size

        reverse(nums, 0, n)
        reverse(nums, 0, rot-1)
        reverse(nums, rot, n)
    }

    private fun reverse(nums: IntArray, start: Int, end: Int){
        var lo = start; var hi = end
        while(lo < hi){
            val temp = nums[lo]
            nums[lo] = nums[hi]
            nums[hi] = temp
            lo += 1
            hi -= 1
        }
    }
}