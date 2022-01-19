package sort

class QuickSort {
    fun sort(nums: IntArray){
        quickSort(nums, 0, nums.size-1)
        println(nums.toList())
    }

    private fun quickSort(nums: IntArray, l: Int, r:Int){
        if(l < r){
            val pivot = findPartition(nums, l, r)
            quickSort(nums, l, pivot-1)
            quickSort(nums, pivot+1, r)
        }
    }

    private fun findPartition(nums: IntArray, l: Int, r: Int): Int{
        val pivot = r
        var pIndex = l

        for(i in l until r){
            if(nums[i] <= nums[pivot]){
                swap(nums, i, pivot)
                pIndex++
            }
        }

        swap(nums, pIndex, pivot)

        return pIndex
    }

    private fun swap(nums: IntArray, n1: Int, n2: Int){
        val temp = nums[n1]
        nums[n1] = nums[n2]
        nums[n2] = temp
    }

}