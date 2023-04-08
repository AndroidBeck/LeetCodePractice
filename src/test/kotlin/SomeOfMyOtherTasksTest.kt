import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SomeOfMyOtherTasksTest {

    private val someOfMyOtherTasks = SomeOfMyOtherTasks()
    @Test
    fun `test reverseDigitsInString`() {
        val origStr = "P1y2t3h4o5n"
        println(someOfMyOtherTasks.reverseDigitsInString(origStr).toCharArray())
        assertEquals("P5y4t3h2o1n", someOfMyOtherTasks.reverseDigitsInString(origStr))
    }
}