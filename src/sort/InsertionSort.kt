package sort

class InsertionSort {
    fun sort(nums: IntArray){
        for(i in 1 until nums.size){
            val temp = nums[i]
            var hole = i

            while(hole > 0 && nums[hole - 1] > temp){
                nums[hole] = nums[hole - 1]
                hole--
            }

            nums[hole] = temp
        }

        println(nums.toList())
    }
}