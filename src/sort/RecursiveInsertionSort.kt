package sort

class RecursiveInsertionSort {
    fun sort(nums: IntArray){
        recursiveSort(nums, nums.size-1)
        println(nums.toList())
    }

    private fun recursiveSort(nums: IntArray, n: Int){
        if(n <= 0) return

        recursiveSort(nums, n-1)

        val value = nums[n]
        var hole = n
        while(hole > 0 && nums[hole - 1] > value){
            nums[hole] = nums[hole - 1]
            hole--
        }

        nums[hole] = value
    }

}