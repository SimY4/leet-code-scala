package leet

import scala.annotation.tailrec

object LongestPalindrome:
  def longestPalindrome(s: String): String =
    @tailrec def expandAroundCenter(left: Int, right: Int): String =
      if left >= 0 && right < s.length && s(left) == s(right) then expandAroundCenter(left - 1, right + 1)
      else s.substring(left + 1, right)

    extension (s: String) private infix def max(other: String): String =
      if s.length >= other.length then s else other

    var longest = ""
    for i <- s.indices do
      val oddPalindrome  = expandAroundCenter(i, i)
      val evenPalindrome = expandAroundCenter(i, i + 1)
      longest = longest max oddPalindrome max evenPalindrome
    longest
