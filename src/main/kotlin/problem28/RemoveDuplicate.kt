package problem28

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
fun main(args: Array<String>) {
    println("Hello world")
    println("answer is ${removeDuplicatesII(intArrayOf(0,0,1,1,1,2,2,3,3,4))}")
    println("Hello world")

}

fun removeDuplicatesII(nums: IntArray): Int {
    var p1 = 0
    var p2 = 1

    while (p2 < nums.size) {
        if (nums[p1]<nums[p2]) {
            if ((p1+1) != p2) {
                val temp = nums[p1+1]
                nums[p1+1] = nums[p2]
                nums[p2] = temp
            }
            p1++
        }
        p2++
    }

    println("answer array is ${nums.contentToString()}")

    return ++p1
}

