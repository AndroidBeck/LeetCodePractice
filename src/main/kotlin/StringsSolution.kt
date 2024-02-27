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

    /*
    https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/880/
    Reverse Integer
    Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside
    the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
    Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

    Example 1: Input: x = 123  Output: 321
    Example 2: Input: x = -123  Output: -321
    Example 3: Input: x = 120  Output: 21
     */
    fun reverse(x: Int): Int {
        var input = x
        var reversed = 0

        val checkingEdgeOfMaxValue = Int.MAX_VALUE / 10 // 2147483647 / 10
        val checkingEdgeOfMinValue = Int.MIN_VALUE / 10 // -2147483648 / 10

        while (input != 0) {
            val lastDigit = input % 10
            input /= 10

            // check Max & Min values
            if (reversed > checkingEdgeOfMaxValue || (reversed == checkingEdgeOfMaxValue && lastDigit > 7) ) return 0
            if (reversed < checkingEdgeOfMinValue || (reversed == checkingEdgeOfMinValue && lastDigit < -8) ) return 0

            reversed = reversed * 10 + lastDigit
        }
        return reversed
    }

    /*
    https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/
    First Unique Character in a String

    Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

    s consists of only lowercase English letters.

    Input: s = "leetcode"
    Output: 0
     */
    fun firstUniqChar(s: String): Int {
        val map = hashMapOf<Char, Boolean>()
        s.forEach {
            map[it] = map[it] != null
        }
        s.forEachIndexed { index, char ->
            if (map[char] == false) return index
        }
        return -1
    }

    /*
    https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/
    Valid Anagram

    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
    typically using all the original letters exactly once.

    Input: s = "anagram", t = "nagaram"
    Output: true

    s and t consist of lowercase English letters.
     */
    fun isAnagram(s: String, t: String): Boolean {
        val map = hashMapOf<Char, Int>()
        s.toCharArray().forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }
        t.toCharArray().forEach {
            if (map[it] == null) return false
            map[it] = map[it]!! - 1
        }
        map.entries.forEach {
            if (it.value != 0) return false
        }
        return true
    }

    /*
    https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/
    Valid Palindrome

    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    Given a string s, return true if it is a palindrome, or false otherwise.

    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Explanation: "amanaplanacanalpanama" is a palindrome.

    s consists only of printable ASCII characters.
     */
    fun isPalindrome(s: String): Boolean {
        val chars = s.lowercase()
            .toCharArray()
            .filter { it.isLetterOrDigit() }
        var i = 0
        var j = chars.size - 1
        while (i < j) {
            if (chars[i] != chars[j]) return false
            i++
            j--
        }
        return true
    }
}
