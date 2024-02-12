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
        val size = nums.size
        val shift = k % size
        // println("size = $size, k = $k shift = $shift")
        val nums2 = nums.copyOf()
        for (i in 0 until size) {
            val index = (i + shift) % size
            nums[index] = nums2[i]
            // println("i = $i, index = $index, nums[$i] = ${nums2[index]}")
        }
    }

    fun rotateV2(nums: IntArray, k: Int): Unit {
        val n = nums.size
        val steps = k % n // To handle cases where k > n

        // Function to reverse a portion of the array
        fun reverse(start: Int, end: Int) {
            var i = start
            var j = end
            while (i < j) {
                val temp = nums[i]
                nums[i] = nums[j]
                nums[j] = temp
                i++
                j--
            }
        }

        // Step 1: Reverse the entire array
        reverse(0, n - 1)

        // Step 2: Reverse the first k elements
        reverse(0, steps - 1)

        // Step 3: Reverse the remaining n-k elements
        reverse(steps, n - 1)
    }

    /*
        https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */

    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0 until nums.size - 1) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] == target) return intArrayOf(i, j)
            }
        }
        return intArrayOf(-1)
    }

    fun twoSumV2(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        nums.forEachIndexed { index, i ->
            val goal = target - i
            if (map[goal] != null) return intArrayOf(map[goal]!!, index)
            map[i] = index
        }
        return intArrayOf(-1, -1)
    }

    /*
        https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
        Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
        You must implement a solution with a linear runtime complexity and use only constant extra space.

        Input: nums = [2,2,1]
        Output: 1
     */

    fun singleNumber(nums: IntArray): Int {
        val map = HashMap<Int, Int>()
        nums.forEachIndexed { index, i ->
            if (map[i] == null) map[i] = 1
            else map[i] = 0
        }
        val singleNumber = 0
        map.entries.forEach {
            if (it.value == 1) return it.key
        }
        return Int.MIN_VALUE
    }

    fun singleNumberV2(nums: IntArray): Int {
        var result = 0
        nums.forEach {
            result = result.xor(it)
        }
        return result
    }

    /*
        https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
        Best Time to Buy and Sell Stock II
        You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
        On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
        Find and return the maximum profit you can achieve.

        Input: prices = [7,1,5,3,6,4]
        Output: 7
        Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
        Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
        Total profit is 4 + 3 = 7.
     */
    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        for (i in 0 until prices.size - 1) {
            profit += (prices[i+1] - prices[i]).coerceAtLeast(0)
        }
        return profit
    }

    /*
    https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

    Input: nums = [1,2,3,1]
    Output: true
     */
    fun containsDuplicate(nums: IntArray): Boolean {
        val map = HashMap<Int, Boolean>()
        nums.forEach { i ->
            if (map.get(i) == true) return true
            map[i] = true
        }
        return false
    }

    /*
    https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
    Intersection of Two Arrays II
    Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result
    must appear as many times as it shows in both arrays and you may return the result in any order.

    Input: nums1 = [1,2,2,1], nums2 = [2,2]
    Output: [2,2]
     */
    fun intersectV1(nums1: IntArray, nums2: IntArray): IntArray {
        val intersectionList = arrayListOf<Int>()
        nums1.sort()
        nums2.sort()
        var i = 0
        var j =0
        while (i < nums1.size && j < nums2.size) {
            println("nums1[$i] = ${nums1[i]}, nums2[$j] = ${nums2[j]}")
            if (nums1[i] == nums2[j]) {
                intersectionList.add(nums1[i])
                i++
                j++
            }
            else if (nums1[i] > nums2[j]) j++
            else i++
        }
        return intersectionList.toIntArray()
    }

    fun intersectV2(nums1: IntArray, nums2: IntArray): IntArray {
        val map1 = mutableMapOf<Int, Int>()
        val map2 = mutableMapOf<Int, Int>()
        nums1.forEach {
            if (map1[it] == null) map1[it] = 1 else map1[it] = map1[it]!!.plus(1)
        }
        nums2.forEach {
            if (map2[it] == null) map2[it] = 1 else map2[it] = map2[it]!!.plus(1)
        }

        val intersectionList = arrayListOf<Int>()
        map1.entries.forEach { map1Entry ->
            map2[map1Entry.key]?.let {
                val quantity = it.coerceAtMost(map1Entry.value)
                for (i in 1..quantity) intersectionList.add(map1Entry.key)
            }
        }
        return intersectionList.toIntArray()
    }

    /*
    https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/
    Plus One
    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
    The digits are ordered from most significant to least significant in left-to-right order.
    The large integer does not contain any leading 0's.
    Increment the large integer by one and return the resulting array of digits.

    Input: digits = [1,2,3]
    Output: [1,2,4]
    Explanation: The array represents the integer 123.
    Incrementing by one gives 123 + 1 = 124.
    Thus, the result should be [1,2,4].
     */
    fun plusOne(digits: IntArray): IntArray {
        val digitsList = arrayListOf<Int>()
        var i = digits.size - 1
        var proceedIncrementation = true

        while (i >= 0) {
            if(proceedIncrementation) {
                if (digits[i] == 9) {
                    digitsList.add(0)
                }
                else {
                    digitsList.add(digits[i]+1)
                    proceedIncrementation = false
                }
            }
            else digitsList.add(digits[i])
            i--
        }
        if (proceedIncrementation) digitsList.add(1)
        return digitsList.reversed().toIntArray()
    }

    fun plusOneV2(digits: IntArray): IntArray {
        for (i in digits.size - 1 downTo 0) {
            if (digits[i] < 9) {
                digits[i]++
                return digits
            }
            digits[i] = 0
        }
        val newDigits = IntArray(digits.size + 1)
        newDigits[0] = 1
        return newDigits
    }
}
