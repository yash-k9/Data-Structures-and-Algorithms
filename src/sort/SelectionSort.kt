package sort

class SelectionSort {
    fun sort(nums: IntArray){
        for((pos, i) in nums.indices.withIndex()){
            var min = pos

            for(j in pos until nums.size){
                if(nums[j] < nums[min]){
                    min = j
                }
            }

            val temp = nums[min]
            nums[min] = nums[pos]
            nums[pos] = temp
        }

        print(nums.toList())
    }
}