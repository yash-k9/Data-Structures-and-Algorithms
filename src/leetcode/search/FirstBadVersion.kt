package leetcode.search

class FirstBadVersion: VersionControl {
    override fun firstBadVersion(n: Int): Int {
        var lo = 1; var hi = n

        while(lo < hi){
            val mid = lo + (hi-lo)/2
            if(isBadVersion(mid)){
                hi = mid
            }else{
                lo = mid + 1
            }
        }

        return lo
    }

}

interface VersionControl{
    fun firstBadVersion(n: Int) : Int
}

//Boolean is returned by the API, hardcoded for now
fun isBadVersion(num : Int): Boolean{
    return false
}