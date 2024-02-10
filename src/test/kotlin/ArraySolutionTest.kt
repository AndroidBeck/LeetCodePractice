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

    @Test
    fun `test singleNumber`() {
        val nums = intArrayOf(2, 2, 1)
        assertEquals(1, arraySolution.singleNumber(nums))

        val nums2 = intArrayOf(4,1,2,1,2)
        assertEquals(4, arraySolution.singleNumber(nums2))

        val nums3 = intArrayOf(1)
        assertEquals(1, arraySolution.singleNumber(nums3))
    }

    @Test
    fun `test singleNumberV2`() {
        val nums = intArrayOf(2, 2, 1)
        assertEquals(1, arraySolution.singleNumberV2(nums))

        val nums2 = intArrayOf(4,1,2,1,2)
        assertEquals(4, arraySolution.singleNumberV2(nums2))

        val nums3 = intArrayOf(1)
        assertEquals(1, arraySolution.singleNumberV2(nums3))
    }

    @Test
    fun `test rotate`() {
        val nums = intArrayOf(1,2,3,4,5,6,7)
        val k = 3
        arraySolution.rotate(nums, k)
        assertArrayEquals(intArrayOf(5,6,7,1,2,3,4), nums)

        val nums2 = intArrayOf(-1,-100,3,99)
        val k2 = 2
        arraySolution.rotate(nums2, k2)
        assertArrayEquals(intArrayOf(3,99,-1,-100), nums2)
    }

    @Test
    fun `test rotateV2`() {
        val nums = intArrayOf(1,2,3,4,5,6,7)
        val k = 3
        arraySolution.rotateV2(nums, k)
        assertArrayEquals(intArrayOf(5,6,7,1,2,3,4), nums)

        val nums2 = intArrayOf(-1,-100,3,99)
        val k2 = 2
        arraySolution.rotateV2(nums2, k2)
        assertArrayEquals(intArrayOf(3,99,-1,-100), nums2)
    }
}
