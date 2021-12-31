package search

/**
 * Binary search has many variations. In case of duplicates,
 * Find the left most or right most element
 *
 *
 * For Left most
 * --------------------
 * if(a[mid] < target){
 *   lo = mid + 1
 * }else{
 *   hi = mid
 * }
 *
 * For Right Most
 * -------------------
 * if(a[mid] > target){
 *   hi = mid
 * }else{
 *   lo = mid + 1
 * }
 *
 *
 * Check this out for more info
 * https://en.wikipedia.org/wiki/Binary_search_algorithm
 * */

class BinarySearchKotlin {
    fun search(nums: IntArray, target: Int): Int {
        if(nums.isEmpty()) return -1

        var lo = 0; var hi = nums.size - 1

        while(lo < hi){
            var mid = lo + (hi - lo) / 2

            if(nums[mid] < target){
                lo = mid + 1
            }else{
                hi = mid
            }
        }

        return if(nums[lo] == target) lo else -1
    }
}