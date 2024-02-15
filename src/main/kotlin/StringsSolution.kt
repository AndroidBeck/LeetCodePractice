class StringsSolution {

    /*
        https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/
        Reverse String

        Write a function that reverses a string. The input string is given as an array of characters s.
        You must do this by modifying the input array in-place with O(1) extra memory.
     */

    fun reverseString(s: CharArray): Unit {
        s.reverse()
    }

    fun reverseStringV2(s: CharArray): Unit {
        var start = 0
        var end = s.size - 1
        while (start < end) {
            s[start] = s[end].also { s[end] = s[start] }
            start++
            end--
        }
    }
}