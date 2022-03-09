package leet

object Submissions:
  object Solution:
    def twoSum(nums: Array[Int], target: Int): Array[Int] =
      (for
        i <- nums.indices
        j <- nums.indices
        if i < j && nums(i) + nums(j) == target
      yield Array(i, j)).head
