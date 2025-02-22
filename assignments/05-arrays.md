# [Video Link](https://youtu.be/n60Dn0UsbEk)

## Submit the following on your Leetcode profile itself.

### Easy

1. [Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/)

```kotlin
fun buildArray(nums: IntArray): IntArray {
    val array = IntArray(nums.size)
    for (index in nums.indices) {
        array[index] = nums[nums[index]]
    }
    return array
}
```

2. [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)

```kotlin
fun getConcatenation(nums: IntArray): IntArray {
    val size = nums.size
    val array = IntArray(size * 2)
    nums.forEachIndexed { index, item ->
        array[index] = item
        array[index + size] = item
    }
    return array
}
```

3. [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/)

```kotlin
fun runningSum(nums: IntArray): IntArray {
    val size = nums.size
    val array = IntArray(size)
    var sum = 0
    nums.forEachIndexed { index, item ->
        sum += item
        array[index] = sum
    }
    return array
}
```

4. [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/)

```kotlin
fun maximumWealth(accounts: Array<IntArray>): Int {
    var wealth = Int.MIN_VALUE
    accounts.forEach { person ->
        var tempWealth = 0
        person.forEach { wealth ->
            tempWealth += wealth
        }
        if (tempWealth > wealth) wealth = tempWealth
    }
    return wealth
}
```

5. [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/)

```kotlin
fun shuffle(nums: IntArray, n: Int): IntArray {
    val array = IntArray(n * 2)
    for (i in 0..<(nums.size / 2)) {
        array[i * 2] = nums[i]
        array[(i * 2) + 1] = nums[i + n]
    }
    return array
}
```

6. [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)

```kotlin
fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {
    val array = BooleanArray(candies.size)
    var max = candies[0]
    for (c in candies) {
        if (max < c) max = c
    }
    for (l in candies.indices) {
        array[l] = (candies[l] + extraCandies) >= max
    }
    return array
}
```

7. [Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/)

```kotlin
fun numIdenticalPairs(nums: IntArray): Int {
    var count = 0
    for (i in nums.indices) {
        for (j in nums.indices) {
            if (i < j && nums[i] == nums[j]) {
                count++
            }
        }
    }
    return count
}
```

```kotlin
// solution using hashmap
fun numIdenticalPairs(nums: IntArray): Int {
    val freqMap = HashMap<Int, Int>()
    var count = 0
    for (item in nums) {
        if (freqMap.containsKey(item)) {
            count += freqMap[item]!!
            freqMap[item] = freqMap[item]!! + 1
        } else {
            freqMap[item] = 1
        }
    }
    return count
}
```

8. [How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/)
```kotlin
fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    val array = IntArray(nums.size)
    var count = 0
    for (i in nums.indices) {
        for (j in nums.indices) {
            if (i != j && nums[j] < nums[i]) {
                count++
            }
        }
        array[i] = count
        count = 0
    }
    return array
}
```
9. [Create Target Array in the Given Order](https://leetcode.com/problems/create-target-array-in-the-given-order/)
```kotlin
fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
    val targetArray = mutableListOf<Int>()
    nums.forEachIndexed { i, item ->
        targetArray.add(index[i], item)
    }
    return targetArray.toIntArray()
}
```
10. [Check if the Sentence Is Pangram](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)
11. [Count Items Matching a Rule](https://leetcode.com/problems/count-items-matching-a-rule/)
12. [Find the Highest Altitude](https://leetcode.com/problems/find-the-highest-altitude/)
13. [Flipping an Image](https://leetcode.com/problems/flipping-an-image/)
14. [Cells with Odd Values in a Matrix](https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/)
15. [Matrix Diagonal Sum](https://leetcode.com/problems/matrix-diagonal-sum/)
16. [Find Numbers with Even Number of Digits](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)
17. [Transpose Matrix](https://leetcode.com/problems/transpose-matrix/)
18. [Add to Array-Form of Integer](https://leetcode.com/problems/add-to-array-form-of-integer/)
19. [Maximum Population Year](https://leetcode.com/problems/maximum-population-year/)
20. [Determine Whether Matrix Can Be Obtained By Rotation](https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/)
21. [Two Sum](https://leetcode.com/problems/two-sum/)
22. [Find N Unique Integers Sum up to Zero](https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/)
23. [Lucky Number In a Matrix](https://leetcode.com/problems/lucky-numbers-in-a-matrix/)
24. [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)
25. [Reshape the Matrix](https://leetcode.com/problems/reshape-the-matrix/)
26. [Plus One](https://leetcode.com/problems/plus-one/)
27. [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
28. [Minimum Cost to Move Chips to The Same Position](https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/)

### Medium

1. [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)
2. [Spiral Matrix II](https://leetcode.com/problems/spiral-matrix-ii/)
3. [Spiral Matrix III](https://leetcode.com/problems/spiral-matrix-iii/)
4. [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/)
5. [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/)
6. [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
7. [Jump Game](https://leetcode.com/problems/jump-game/)
8. [Rotate Array](https://leetcode.com/problems/rotate-array/)
9. [Sort Colors](https://leetcode.com/problems/sort-colors/)
10. [House Robber](https://leetcode.com/problems/house-robber/)

### Hard

1. [Max Value of Equation](https://leetcode.com/problems/max-value-of-equation/)
2. [First Missing Positive](https://leetcode.com/problems/first-missing-positive/)
3. [Good Array](https://leetcode.com/problems/check-if-it-is-a-good-array/)
