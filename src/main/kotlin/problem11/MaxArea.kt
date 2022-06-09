package problem11

import kotlin.math.max

//https://leetcode.com/problems/container-with-most-water/
fun main(args: Array<String>) {
    println("Hello world")
    println("answer is ${maxArea(intArrayOf(1,8,6,2,5,4,8,3,7))}")
    println("Hello world")

}

fun maxArea(height: IntArray): Int {

    var maxArea = 0

    var L = 0
    var R = height.size - 1

    while (L < R) {
        val currentArea = (R - L) * minOf(height[L], height[R])

        if (height[L] < height[R]) {
            L++
        } else {
            R--
        }

       maxArea = if (maxArea<currentArea) currentArea else maxArea
    }

    return maxArea

}
