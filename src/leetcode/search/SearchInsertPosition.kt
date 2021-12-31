package leetcode.search

class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        if(nums.isEmpty()) return 0

        var lo = 0; var hi = nums.size

        while(lo < hi){
            var mid = lo + (hi-lo) / 2

            if(nums[mid] < target){
                lo = mid + 1
            }else{
                hi = mid
            }
        }

        return lo
    }
}