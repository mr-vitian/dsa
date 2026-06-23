class Solution {

    fun moveZeroes(nums: IntArray) {

        var left = 0

        for (right in nums.indices) {
            if (nums[right] != 0) {
                val temp = nums[right]
                nums[right] = nums[left]
                nums[left] = temp
                left++
            }
        }
    }
}