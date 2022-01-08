package leetcode.twopointers

class TwoSumArraySorted {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var start = 0; var end = numbers.size - 1

        while(start < end){
            val sum = numbers[start] + numbers[end]

            if(sum == target){
                return intArrayOf(start+1, end+1)
            }else if(sum > target){
                end -= 1
            }else{
                start += 1
            }
        }

        return IntArray(2)
    }
}