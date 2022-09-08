open class VersionControl {
    fun isBadVersion(version: Int) : Boolean = false
    open fun firstBadVersion(n: Int) : Int = 4
}

class SortingAndSearchingSolution : VersionControl() {

    /*
        https://leetcode.com/explore/interview/card/top-interview-questions-easy/96/sorting-and-searching/774/

        First Bad Version

        The isBadVersion API is defined in the parent class VersionControl.
        fun isBadVersion(version: Int) : Boolean {}
     */

    override fun firstBadVersion(n: Int) : Int {
        var start = 1
        var end = n
        var firstBad = end

        while (start < end) {
            firstBad = ((start.toLong() + end.toLong()) / 2).toInt()
            if (isBadVersion(firstBad)) end = firstBad else start = ++firstBad
        }
        return firstBad
    }
}