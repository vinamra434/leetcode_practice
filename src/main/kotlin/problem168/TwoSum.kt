package problem168

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
fun main(args: Array<String>) {
    println("Hello world")
    println("answer is ${twoSum(intArrayOf(2,3,4), 6).contentToString()}")
    println("Hello world")

}

private fun twoSum(numbers: IntArray, target: Int): IntArray {
    var pLeft = 1
    var pRight = numbers.size
    val answer = intArrayOf(0,0)

    while (pLeft < pRight) {

        if (numbers[pLeft-1] + numbers[pRight-1] == target) {
            answer[0] = pLeft
            answer[1] = pRight
            return answer
        }

        if (numbers[pLeft-1] + numbers[pRight-1] < target) {
            pLeft++
        }

        if (numbers[pLeft-1] + numbers[pRight-1] > target) {
            pRight--
        }
    }

    return answer
}

/*

1. Sum of pointers
    1. If equal then answer
    2. If greater
        1. Decrease pointer right and repeat
    3. If lesser
        1. Increase pointer left and repeat

* */

