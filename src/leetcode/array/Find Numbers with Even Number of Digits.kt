package leetcode.array

class FindNumbersWithEvenNumberOfDigits {
    fun findNumbers(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var res = 0
        for (i in nums) {
            if (numCount(i) % 2 == 0) {
                res += 1
            }
        }

        return res
    }

    private fun numCount(n: Int): Int {
        var count = 0; var num = n

        while (num > 0) {
            count += 1
            num /= 10
        }
        return count
    }
}