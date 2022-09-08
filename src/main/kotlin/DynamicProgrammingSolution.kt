class DynamicProgrammingSolution {

    /*
        https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/569/

        You are climbing a staircase. It takes n steps to reach the top.
        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
        1 <= n <= 45
     */

    fun climbStairs(n: Int): Int {
        return if (n < 1) 0
        else if (n == 1) 1
        else if (n == 2) 2
        else climbStairs(n - 1) + climbStairs(n - 2)
    }

    //Dynamic programming
    fun climbStairsV2(n: Int): Int {
        val dp = Array(n + 1) { 0 }
        dp[0] = 1 //need for fibonacci
        dp[1] = 1 //1 step
        (2..n).forEach {
            dp[it] = dp[it - 1] + dp[it - 2]
        }
        return dp[n]
    }

    fun climbStairsV3(n: Int): Int {
        if (n < 1) return 0
        if (n == 1) return 1
        if (n == 2) return 2
        var result = 0
        var tmp1 = 1
        var tmp2 = 2
        (3..n).forEach {
            result = tmp1 + tmp2
            tmp1 = tmp2
            tmp2 = result
        }
        return result
    }

    /*
        https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/572/

        Input: prices = [7,1,5,3,6,4]
        Output: 5
        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
     */

    fun maxProfit(prices: IntArray): Int {
        if (prices.size < 2) return 0
        var maxProfit = 0
        for (i in 0 until prices.size - 1) {
            for (j in i until prices.size) {
                val profit = prices[j] - prices[i]
                if (profit > maxProfit) maxProfit = profit
            }
        }
        return maxProfit
    }

    fun maxProfitV2Kadane(prices: IntArray): Int {
        var delta = 0
        var localMaxProfit = 0
        var globalMaxProfit = 0
        for (i in 1 until prices.size) {
            delta = (prices[i] - prices[i - 1])
            localMaxProfit += delta
            localMaxProfit = localMaxProfit.coerceAtLeast(0)
            globalMaxProfit = globalMaxProfit.coerceAtLeast(localMaxProfit)
        }
        return globalMaxProfit
    }

    /*
        https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/566/

        Given an integer array nums, find the contiguous subarray (containing at least one number)
        which has the largest sum and return its sum.

        Input: nums = [5,4,-1,7,8]
        Output: 23
     */

    fun maxSubArray(nums: IntArray): Int {
        var localMaximumSum = nums[0]
        var globalMaximumSum = nums[0]
        for (i in 1 until nums.size) {
            if (nums[i] > localMaximumSum + nums[i]) {
                localMaximumSum = nums[i]
            } else
                localMaximumSum += nums[i]
            globalMaximumSum = globalMaximumSum.coerceAtLeast(localMaximumSum)
        }
        return globalMaximumSum
    }

    /*
        https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/576/

        You are a professional robber planning to rob houses along a street.
        Each house has a certain amount of money stashed, the only constraint stopping you from robbing
        each of them is that adjacent houses have security systems connected and it will automatically contact
        the police if two adjacent houses were broken into on the same night.

        Given an integer array nums representing the amount of money of each house, return the maximum amount of money
        you can rob tonight without alerting the police.

        Input: nums = [2,7,9,3,1]
        Output: 12
        Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
        Total amount you can rob = 2 + 9 + 1 = 12.
     */

    fun rob(nums: IntArray): Int {
        if (nums.size == 1) return nums[0]
        val dp = Array(nums.size) { 0 }
        dp[0] = nums[0]
        dp[1] = maxOf(nums[0], nums[1])
        for (i in 2 until nums.size) {
            dp[i] = maxOf(nums[i] + dp[i - 2], dp[i-1])
        }
        return dp.last()
    }

    fun robV2(nums: IntArray): Int {
        var prev2 = 0
        var prev = 0
        var rob = 0
        var notRob = 0
        var maxValue = 0
        for (currentValue in nums) {
            rob = prev2 + currentValue
            notRob = prev
            maxValue = maxOf(rob, notRob)
            prev2 = prev
            prev = maxValue
        }
        return maxValue
    }

}