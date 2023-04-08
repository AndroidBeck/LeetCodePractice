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
}