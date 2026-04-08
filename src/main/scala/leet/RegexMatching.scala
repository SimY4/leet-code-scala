package leet

object RegexMatching:
  def isMatch(s: String, p: String): Boolean =
    p.r.matches(s)
