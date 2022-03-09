package leet

object LongestSubsctringWithoutRepeatingCharacters:
  object Solution:
    def lengthOfLongestSubstring(s: String): Int =
      (for
        init <- s.inits
        tail <- init.tails
        if tail.toSet.size == tail.size
      yield tail.size).max
