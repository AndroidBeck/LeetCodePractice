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

    @Test
    fun `test maxProfit`() {
        val prices = intArrayOf(7,1,5,3,6,4)
        assertEquals(7, arraySolution.maxProfit(prices))

        val prices2 = intArrayOf(1,2,3,4,5)
        assertEquals(4, arraySolution.maxProfit(prices2))

        val prices3 = intArrayOf(7,6,4,3,1)
        assertEquals(0, arraySolution.maxProfit(prices3))
    }

    @Test
    fun `test containsDuplicate`() {
        assertTrue(arraySolution.containsDuplicate(intArrayOf(1,2,3,1)))
        assertFalse(arraySolution.containsDuplicate(intArrayOf(1,2,3,4)))
        assertTrue(arraySolution.containsDuplicate(intArrayOf(1,1,1,3,3,4,3,2,4,2)))
    }

    @Test
    fun `test intersectV1`() {
        assertArrayEquals(intArrayOf(2, 2), arraySolution.intersectV1(intArrayOf(1,2,2,1), intArrayOf(2, 2)))
        //[9,4] is also accepted.
        assertArrayEquals(intArrayOf(4, 9), arraySolution.intersectV1(intArrayOf(4,9,5), intArrayOf(9,4,9,8,4)))
    }

    @Test
    fun `test intersectV2`() {
        assertArrayEquals(intArrayOf(2, 2), arraySolution.intersectV2(intArrayOf(1,2,2,1), intArrayOf(2, 2)))
        //[9,4] is also accepted.
        assertArrayEquals(intArrayOf(4, 9), arraySolution.intersectV2(intArrayOf(4,9,5), intArrayOf(9,4,9,8,4)))
    }

    @Test
    fun `test plusOne`() {
        assertArrayEquals(intArrayOf(1,2,4), arraySolution.plusOne(intArrayOf(1,2,3)))
        assertArrayEquals(intArrayOf(4,3,2,2), arraySolution.plusOne(intArrayOf(4,3,2,1)))
        assertArrayEquals(intArrayOf(1,0), arraySolution.plusOne(intArrayOf(9)))
        assertArrayEquals(intArrayOf(1,0,0,0), arraySolution.plusOne(intArrayOf(9,9,9)))
    }

    @Test
    fun `test plusOneV2`() {
        assertArrayEquals(intArrayOf(1,2,4), arraySolution.plusOneV2(intArrayOf(1,2,3)))
        assertArrayEquals(intArrayOf(4,3,2,2), arraySolution.plusOneV2(intArrayOf(4,3,2,1)))
        assertArrayEquals(intArrayOf(1,0), arraySolution.plusOneV2(intArrayOf(9)))
        assertArrayEquals(intArrayOf(1,0,0,0), arraySolution.plusOneV2(intArrayOf(9,9,9)))
    }

    @Test
    fun `test moveZeroes`() {
        val nums = intArrayOf(0,1,0,3,12)
        arraySolution.moveZeroes(nums)
        assertArrayEquals(intArrayOf(1,3,12,0,0), nums)

        val nums2 = intArrayOf(0)
        arraySolution.moveZeroes(nums2)
        assertArrayEquals(intArrayOf(0), nums2)

        val nums3 = intArrayOf(0, 0, 1, 0, 0, 0 , 2, 3, 4, 0, 5, 6, 7, 0, 0, 0)
        arraySolution.moveZeroes(nums3)
        assertArrayEquals(intArrayOf(1,2,3,4,5,6,7,0,0,0,0,0,0,0,0,0), nums3)
    }

    @Test
    fun `test isValidSudoku`() {
        val array1: Array<CharArray> =
           arrayOf(
               charArrayOf('5','3','.','.','7','.','.','.','.'),
               charArrayOf('6','.','.','1','9','5','.','.','.'),
               charArrayOf('.','9','8','.','.','.','.','6','.'),
               charArrayOf('8','.','.','.','6','.','.','.','3'),
               charArrayOf('4','.','.','8','.','3','.','.','1'),
               charArrayOf('7','.','.','.','2','.','.','.','6'),
               charArrayOf('.','6','.','.','.','.','2','8','.'),
               charArrayOf('.','.','.','4','1','9','.','.','5'),
               charArrayOf('.','.','.','.','8','.','.','7','9')
            )
        assertTrue(arraySolution.isValidSudoku(array1))

        val array2: Array<CharArray> =
            arrayOf(
                charArrayOf('8','3','.','.','7','.','.','.','.'),
                charArrayOf('6','.','.','1','9','5','.','.','.'),
                charArrayOf('.','9','8','.','.','.','.','6','.'),
                charArrayOf('8','.','.','.','6','.','.','.','3'),
                charArrayOf('4','.','.','8','.','3','.','.','1'),
                charArrayOf('7','.','.','.','2','.','.','.','6'),
                charArrayOf('.','6','.','.','.','.','2','8','.'),
                charArrayOf('.','.','.','4','1','9','.','.','5'),
                charArrayOf('.','.','.','.','8','.','.','7','9')
            )
        assertFalse(arraySolution.isValidSudoku(array2))

        // Check V2
        assertTrue(arraySolution.isValidSudokuV2(array1))
        assertFalse(arraySolution.isValidSudokuV2(array2))
    }

    @Test
    fun `test rotateImage`() {
        val matrix1 = arrayOf(
            intArrayOf(1,2,3),
            intArrayOf(4,5,6),
            intArrayOf(7,8,9)
        )
        val output1 = arrayOf(
            intArrayOf(7,4,1),
            intArrayOf(8,5,2),
            intArrayOf(9,6,3)
        )
        arraySolution.rotateImage(matrix1)
        output1.forEachIndexed { i, arr ->
            assertArrayEquals(arr, matrix1[i])
        }

        val matrix2 = arrayOf(
            intArrayOf(5,1,9,11),
            intArrayOf(2,4,8,10),
            intArrayOf(13,3,6,7),
            intArrayOf(15,14,12,16)
        )
        val output2 = arrayOf(
            intArrayOf(15,13,2,5),
            intArrayOf(14,3,4,1),
            intArrayOf(12,6,8,9),
            intArrayOf(16,7,10,11)
        )
        arraySolution.rotateImage(matrix2)
        output2.forEachIndexed { i, arr ->
            assertArrayEquals(arr, matrix2[i])
        }
    }
}
