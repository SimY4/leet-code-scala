package leet

object IntegerToRoman:
  private val values = Array(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
  private val symbols = Array("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")

  def intToRoman(num: Int): String =
    var n = num
    val result = new StringBuilder

    for (i <- values.indices) do
      while n >= values(i) do
        result.append(symbols(i))
        n -= values(i)

    result.toString
