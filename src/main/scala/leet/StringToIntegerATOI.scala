package leet

object StringToIntegerATOI:
  extension (bi: BigInt)
    private def clamp: Int =
      if bi < Int.MinValue then Int.MinValue
      else if bi > Int.MaxValue then Int.MaxValue
      else bi.toInt

  def myAtoi(s: String): Int =
    val trimmed = s.dropWhile(_.isWhitespace)
    if trimmed.isEmpty then 0
    else trimmed.head match
      case '+' =>
        val digits = trimmed.tail.takeWhile(_.isDigit)
        if digits.isEmpty then 0 else BigInt(digits).clamp
      case '-' =>
        val digits = trimmed.tail.takeWhile(_.isDigit)
        if digits.isEmpty then 0 else (-BigInt(digits)).clamp
      case _ =>
        val digits = trimmed.takeWhile(_.isDigit)
        if digits.isEmpty then 0 else BigInt(digits).clamp
