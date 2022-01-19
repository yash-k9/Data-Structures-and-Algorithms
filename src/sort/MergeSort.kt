package sort

class MergeSort {
    fun sort(nums: IntArray){
        mergeSort(nums, 0, nums.size-1)
        println(nums.toList())
    }


    private fun mergeSort(nums: IntArray, l: Int, r:Int){
        if(l < r){
            val mid = l + (r-l) / 2

            mergeSort(nums, l, mid)
            mergeSort(nums, mid+1, r)

            merge(nums, l, r, mid)
        }
    }

    private fun merge(nums: IntArray, l: Int, r:Int, m: Int){
        val n1 = m - l + 1
        val n2 = r - m

        val left = Array(n1){0}
        val right = Array(n2){0}

        for(i in 0 until n1){
            left[i] = nums[l+i]
        }

        for(i in 0 until n2){
            right[i] = nums[m+i+1]
        }

        var i = 0; var j = 0; var k = l;

        while(i < n1 && j < n2){
            if (left[i] <= right[j]) {
                nums[k] = left[i];
                i++;
            }
            else {
                nums[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            nums[k] = left[i]
            k++
            i++
        }

        while(j < n2){
            nums[k] = right[j]
            k++
            j++
        }
    }
}