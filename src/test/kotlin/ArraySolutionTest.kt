import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ArraySolutionTest {
    private val arraySolution = ArraySolution()

    @Test
    fun `test toSum`() {
        val nums = intArrayOf(2,7,11,15)
        val target = 9
        assertArrayEquals(intArrayOf(0, 1), arraySolution.twoSum(nums, target))

        val nums2 = intArrayOf(3, 2, 4)
        val target2 = 6
        assertArrayEquals(intArrayOf(1, 2), arraySolution.twoSum(nums2, target2))

        val nums3 = intArrayOf(3, 3)
        val target3 = 6
        assertArrayEquals(intArrayOf(0, 1), arraySolution.twoSum(nums3, target3))

        val nums4 = intArrayOf(2,5,5,11)
        val target4 = 10
        assertArrayEquals(intArrayOf(1, 2), arraySolution.twoSum(nums4, target4))
    }

    @Test
    fun `test toSumV2`() {
        val nums = intArrayOf(2,7,11,15)
        val target = 9
        assertArrayEquals(intArrayOf(0, 1), arraySolution.twoSumV2(nums, target))

        val nums2 = intArrayOf(3, 2, 4)
        val target2 = 6
        assertArrayEquals(intArrayOf(1, 2), arraySolution.twoSumV2(nums2, target2))

        val nums3 = intArrayOf(3, 3)
        val target3 = 6
        assertArrayEquals(intArrayOf(0, 1), arraySolution.twoSumV2(nums3, target3))

        val nums4 = intArrayOf(2,5,5,11)
        val target4 = 10
        assertArrayEquals(intArrayOf(1, 2), arraySolution.twoSumV2(nums4, target4))
    }
}
