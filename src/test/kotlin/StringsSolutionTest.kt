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
}