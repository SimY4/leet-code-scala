package leet

import scala.annotation.tailrec

object ContainerWithMostWater:
  def maxArea(height: Array[Int]): Int =
    @tailrec def loop(left: Int, right: Int, maxArea: Int): Int =
      if left >= right then maxArea
      else
        val area = (right - left) * (height(left) min height(right))
        if height(left) < height(right) then loop(left + 1, right, maxArea max area)
        else loop(left, right - 1, maxArea max area)

    loop(0, height.length - 1, 0)
