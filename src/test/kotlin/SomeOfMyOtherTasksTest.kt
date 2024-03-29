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

    @Test
    fun `test calculateMaxProfitV2`() {
        val prices = arrayOf(1, 3, 1, 2)
        assertEquals(10, someOfMyOtherTasks.calculateMaxProfitV2(prices))

        val prices2 = arrayOf(10, 2, 6, 4, 3, 1, 2, 2, 2)
        assertEquals(37, someOfMyOtherTasks.calculateMaxProfitV2(prices2))
    }

    @Test
    fun `test calculateWeightOfAGoodSetOfElements`() {
        val elements = arrayOf(1 ,7, 3, 15, 2, 5, 2, 1, 4)
        assertEquals(22, someOfMyOtherTasks.calculateWeightOfAGoodSetOfElements(elements))

        val elements2 = arrayOf(3, 3, 3, 1, 3, 7, 1)
        assertEquals(13, someOfMyOtherTasks.calculateWeightOfAGoodSetOfElements(elements2))
    }
}