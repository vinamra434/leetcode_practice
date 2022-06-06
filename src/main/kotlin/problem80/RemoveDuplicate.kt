package problem80

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
fun main(args: Array<String>) {
    println("Hello world")
    println("answer is ${removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4))}")
    println("Hello world")

}

private fun removeDuplicates(nums: IntArray): Int {

    var L = 0
    var R = 1
    var Counter = 0
    val n = nums.size

    while (R < n) {

        if (nums[L] == nums[R] && Counter < 1) {
            Counter++
            nums[++L] = nums[R]
        }

        if (nums[L] != nums[R]) {
            nums[++L] = nums[R]
            Counter = 0
        }

        R++
    }

    println("answer array is ${nums.contentToString()}")

    return L + 1
}

