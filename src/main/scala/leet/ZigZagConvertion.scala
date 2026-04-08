package leet

object ZigZagConvertion:
  def convert(s: String, numRows: Int): String =
    if numRows == 1 then s
    else
      val rows = Array.fill(numRows)(new StringBuilder)
      var currentRow = 0
      var direction = -1

      for c <- s do
        rows(currentRow).append(c)
        if currentRow == 0 || currentRow == numRows - 1 then direction = -direction
        currentRow += direction

      rows.map(_.toString).mkString
