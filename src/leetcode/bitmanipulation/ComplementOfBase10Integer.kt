package leetcode.bitmanipulation

class ComplementOfBase10Integer {
    fun bitwiseComplement(n: Int): Int {
        if (n == 0) return 1

        var ones = 0
        var i = 0

        while (ones > n) {
            ones += 1.shl(i)
            i++
        }

        return n - ones
    }
}