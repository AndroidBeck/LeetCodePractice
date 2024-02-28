import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class StringsSolutionTest {
    private val stringSolution = StringsSolution()

    @Test
    fun reverseString() {
        val s = charArrayOf('h','e','l','l','o')
        stringSolution.reverseString(s)
        assertArrayEquals(charArrayOf('o','l','l','e','h'), s)

        val s2 = charArrayOf('H','a','n','n','a','h')
        stringSolution.reverseString(s2)
        assertArrayEquals(charArrayOf('h','a','n','n','a','H'), s2)
    }

    @Test
    fun reverseStringV2() {
        val s = charArrayOf('h','e','l','l','o')
        stringSolution.reverseStringV2(s)
        assertArrayEquals(charArrayOf('o','l','l','e','h'), s)

        val s2 = charArrayOf('H','a','n','n','a','h')
        stringSolution.reverseStringV2(s2)
        assertArrayEquals(charArrayOf('h','a','n','n','a','H'), s2)
    }

    @Test
    fun reverse() {
        assertEquals(321, stringSolution.reverse(123))
        assertEquals(-321, stringSolution.reverse(-123))
        assertEquals(21, stringSolution.reverse(120))
        assertEquals(0, stringSolution.reverse(Int.MAX_VALUE))
    }

    @Test
    fun firstUniqChar() {
        assertEquals(0, stringSolution.firstUniqChar("leetcode"))
        assertEquals(2, stringSolution.firstUniqChar("loveleetcode"))
        assertEquals(-1, stringSolution.firstUniqChar("aabb"))
    }

    @Test
    fun isAnagram() {
        assertTrue(stringSolution.isAnagram("anagram", "nagaram"))
        assertFalse(stringSolution.isAnagram("rat", "car"))
    }

    @Test
    fun isPalindrome() {
        assertTrue(stringSolution.isPalindrome("A man, a plan, a canal: Panama"))
        assertFalse(stringSolution.isPalindrome("race a car"))
        // an empty string reads the same forward and backward, it is a palindrome.
        assertTrue(stringSolution.isPalindrome(" "))
    }

    @Test
    fun myAtoi() {
        assertEquals(42, stringSolution.myAtoi("42"))
        assertEquals(-42, stringSolution.myAtoi("   -42"))
        assertEquals(4193, stringSolution.myAtoi("4193 with words"))
        assertEquals(0, stringSolution.myAtoi(""))
        assertEquals(2147483647, stringSolution.myAtoi("21474836460"))
        assertEquals(-2147483648, stringSolution.myAtoi("-91283472332"))
    }
}