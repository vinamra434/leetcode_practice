package problem977

//https://leetcode.com/problems/move-zeroes/
fun main(args: Array<String>) {
    println("Hello world")
    println("answer is ${sortedSquares(intArrayOf(-7,-6,-5,-4,-3)).contentToString()}")
    println("answer is ${sortedSquares(intArrayOf(1,2,3,4,5,6)).contentToString()}")
    println("answer is ${sortedSquares(intArrayOf(-5,-4,-3,-2,-1,0,1,2,3,4,5,6)).contentToString()}")
    println("Hello world")

}

fun sortedSquares(nums: IntArray): IntArray {

    var midIndex = nums.size-1

    for (i in nums.indices) {
        if (nums[i] >= 0) {
            midIndex = i
            break
        }
    }

    var L = midIndex - 1
    var R = midIndex

    val retVal = IntArray(nums.size)

    var index = 0

    while (L > -1 && R < nums.size) {
        val left = nums[L] * nums[L]
        val right = nums[R] * nums[R]

        if (left > right) {
            retVal[index] = right
            R++
        } else {
            retVal[index] = left
            L--
        }
        index++
    }

    if (R >= nums.size) {
        for (i in L downTo  0) {
            retVal[index] = nums[i] * nums[i]
            index++
        }
    }

    if (L <= -1) {
        for (i in R until nums.size) {
            retVal[index] = nums[i] * nums[i]
            index++
        }
    }

    return retVal
}

/*

* */

