class ArraySolution {

    /*
        https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
        Remove Duplicates from Sorted Array

        Do not allocate extra space for another array.
        You must do this by modifying the input array in-place with O(1) extra memory.

        Input: nums = [1,1,2]
        Output: 2, nums = [1,2,_]
        Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
        It does not matter what you leave beyond the returned k (hence they are underscores).
     */

    fun removeDuplicates(nums: IntArray): Int {
        var newSize = nums.size
        var i = 1
        while (i < newSize) {
            if (nums[i] == nums [i-1]) {
                // Shift elements
                for (k in i until newSize - 1)
                    nums[k] = nums[k+1]
                newSize--
            }
            else i++
        }
        return newSize
    }

    fun removeDuplicatesV2(nums: IntArray): Int {
        var i = 0
        for (j in 1 until nums.size) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j]
            }
        }
        return i + 1
    }

    /*
        https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
        Rotate Array
        Given an array, rotate the array to the right by k steps, where k is non-negative.

        Input: nums = [1,2,3,4,5,6,7], k = 3
        Output: [5,6,7,1,2,3,4]
     */

    fun rotate(nums: IntArray, k: Int): Unit {

    }

}