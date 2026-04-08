package leet

import scala.annotation.tailrec

object LengthOfLongestSubstring:
  def lengthOfLongestSubstring(s: String): Int =
    @tailrec def loop(start: Int, end: Int, maxLength: Int): Int =
      if end >= s.length then maxLength
      else if s.substring(start, end).contains(s(end)) then loop(start + 1, end, maxLength)
      else loop(start, end + 1, maxLength max (end - start + 1))

    loop(0, 0, 0)
