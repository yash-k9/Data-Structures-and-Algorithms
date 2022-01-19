package sort

class BubbleSort {
    fun sort(nums: IntArray){
        val end = nums.size - 1

        for(i in 0 until end){
            for(j in 0 until end-i){
                if(nums[j] > nums[j+1]){
                    val temp = nums[j]
                    nums[j] = nums[j+1]
                    nums[j+1] = temp
                }
            }
        }

        println(nums.toList())
    }
}