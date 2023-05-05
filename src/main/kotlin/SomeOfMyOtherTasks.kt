class SomeOfMyOtherTasks {

    // Task from Maximov - reverse digits in string
    fun reverseDigitsInString(str: String): String {
        if (str.length <= 1) return str
        val indexes = mutableListOf<Int>()
        val digits = mutableListOf<Char>()
        str.forEachIndexed { index, char ->
            if (char.isDigit()) {
                indexes.add(index)
                digits.add(char)
            }
        }
        digits.reverse()

        val result: CharArray = str.toCharArray()
        indexes.forEachIndexed { index, i ->
            result[i] = digits[index]
        }
        return String(result)
    }

    // Every day we produce 1 point of goods. We can save it for later or trade it. We know the price for each day.
    // Design algorithm calculating maximum gain
    // Ex: 1 3 1 2 -> 10
    fun calculateMaxProfit(prices: Array<Int>): Int {
        var sum = 0
        var localMax = prices.last()
        var goodsForTradeQuantity = 0
        for (i in prices.size -1 downTo 0) {
            goodsForTradeQuantity++
            if (prices[i] > localMax) {
                // Trade for old price (local max)
                sum += localMax * (goodsForTradeQuantity - 1)
                //Save new local max
                localMax = prices[i]
                //Save current good for later trade
                goodsForTradeQuantity = 1
            }
            // println("i = $i, current price = ${prices[i]}, local max = $localMax, quantity for trade = $goodsForTradeQuantity, sum = $sum")
        }
        // Final trade
        sum += localMax * goodsForTradeQuantity
        // println("After final trade: local max =  $localMax, quantity = $goodsForTradeQuantity, sum = $sum")
        return sum
    }

    fun calculateMaxProfitV2(prices: Array<Int>): Int {
        var sum = 0
        var prevMax = 0
        for (i in prices.size -1 downTo 0) {
            if (prices[i] > prevMax) {
                prevMax = prices[i]
            }
            sum += prevMax
        }
        return sum
    }
}
