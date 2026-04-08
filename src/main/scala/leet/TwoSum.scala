package leet

object TwoSum:
  def twoSum(nums: Array[Int], target: Int): Array[Int] =
    (for
      i <- nums.indices
      j <- (i + 1) until nums.length
      if nums(i) + nums(j) == target
    yield Array(i, j)).head
