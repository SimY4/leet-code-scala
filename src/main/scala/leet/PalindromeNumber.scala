package leet

import scala.annotation.tailrec

object PalindromeNumber:
  def isPalindrome(x: Int): Boolean =
    if x < 0 then false
    else
      val s = x.toString
      @tailrec def loop(left: Int, right: Int): Boolean =
        if left >= right then true
        else if s(left) != s(right) then false
        else loop(left + 1, right - 1)

      loop(0, s.length - 1)
