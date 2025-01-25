class Solution {
        fun twoSum(nums: IntArray, target: Int): IntArray {
            val map = mutableMapOf<Int, Int>()
            nums.forEachIndexed { index, i ->
                val diff = target - i
                if (map.containsKey(diff)) {
                    return intArrayOf(map[diff]!!, index)
                }
                map[i] = index
            }
            return intArrayOf()
        }
    }