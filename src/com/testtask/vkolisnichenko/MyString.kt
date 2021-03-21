package com.testtask.vkolisnichenko;

/**
 * the class in which the representing the string is created
 */
class MyString(inputString: String) {
    //ia variable that is equal to a string when the object is created
    private var string = inputString

    /**
     * method that implements truncation of strings with two parameters
     * @param beginIndex - the index at which the truncation starts
     * @param endIndex - the index at which the truncation starts
     * @return - result string
     */
    fun subString(beginIndex: Int, endIndex: Int): String {
        //check if index more than length string
        if (beginIndex > string.length || endIndex > string.length)
            throw ArrayIndexOutOfBoundsException("the string length is less than the specified index")

        val stringBuilder = StringBuilder()
        for (i in beginIndex..endIndex) {
            stringBuilder.append(string[i])
        }
        return stringBuilder.toString()
    }

    /**
     * a method in which strings are trimmed from
     * the starting index to the end of the string
     * @param beginIndex - the index at which the truncation starts
     * @return - result string
     */
    fun subString(beginIndex: Int): String {
        //check if index more than length string
        if (beginIndex > string.length)
            throw ArrayIndexOutOfBoundsException("the string length is less than the specified index")

        val stringBuilder = StringBuilder()
        for (i in beginIndex until string.length) {
            stringBuilder.append(string[i])
        }
        return stringBuilder.toString()
    }

    /**
     * The method in which the search occurs in the string
     * for the presence of the string that comes in the parameter
     * @param inputString - the string to be searched for
     * @return - returns true if the string is found and false if there is no such string
     */
    operator fun contains(inputString: String): Boolean {
        var i = 0
        while (i < string.length) {
            if (string[i] == inputString[0]) {
                for (j in 1 until inputString.length) {
                    if (i < string.length - 1) i++ else break
                    if (string[i] != inputString[j]) break
                    if (j == inputString.length - 1 && inputString[j] == string[i]) return true
                }
            }
            i++
        }
        return false
    }

    /**
     * method in which string concatenation is performed
     * @param inputStr - the line to be added to the current one
     * @return - result string
     */
    fun concatenation(inputStr: String): String {
        return inputStr.let { string += it; string }
    }

    /**
     * The method in which it performs a newline in the float data type
     * @return - float result
     */
    fun convertStringToFloat(): Float {
        return string.toFloat()
    }

    /**
     * Method that converts int values to
     * string data type and returns them
     * @param - int value
     * @return - convert to string result
     */
    fun convertIntToString(integer: Int): String {
        return integer.toString()
    }

    /**
     * returns the length of the string
     */
    fun length(): Int {
        val char: CharArray = string.toCharArray();
        return char.size
    }

    /**
     * a method that returns the current string
     */
    fun get(): String {
        return string
    }
}