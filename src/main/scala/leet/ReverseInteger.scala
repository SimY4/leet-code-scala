package leet

object ReverseInteger:
  def reverse(x: Int): Int =
    if x == Int.MinValue then 0
    else if x < 0 then -reverse(-x)
    else x.toString.reverse.toIntOption.getOrElse(0)
