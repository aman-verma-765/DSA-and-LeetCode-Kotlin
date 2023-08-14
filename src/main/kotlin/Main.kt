fun main() {
    val arrayQ = ArrayQuestions()
    val nums = intArrayOf(1,2,3,4,0)
    val index = intArrayOf(0,1,2,3,0)

    println(arrayQ.createTargetArray(nums, index).contentToString())
}