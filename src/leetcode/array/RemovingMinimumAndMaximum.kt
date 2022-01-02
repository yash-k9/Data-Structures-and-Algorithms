package leetcode.array

class RemovingMinimumAndMaximum {
    fun minimumDeletions(nums: IntArray): Int {
        var n = nums.size + 1
        var minIndex = 0; var maxIndex = 0

        for(i in nums.indices){
            if(nums[i] > nums[maxIndex]){
                maxIndex = i
            }else if(nums[i] < nums[minIndex]){
                minIndex = i
            }
        }

        var fromStart = Math.max(minIndex, maxIndex) + 1
        var fromEnd = Math.max(n - minIndex, n - maxIndex) + 1
        var minStart = Math.min(minIndex, maxIndex)
        var minEnd = Math.max(minIndex, maxIndex)
        var twoEnd = (minStart + 1) + (n - minEnd + 1)

        return Math.min(fromStart, Math.min(fromEnd, twoEnd))
    }
}