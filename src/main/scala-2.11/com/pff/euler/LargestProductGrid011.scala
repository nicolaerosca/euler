package com.pff.euler

/**
 * @author nicolaerosca
 */
class LargestProductGrid011 {

  def compute(grid: Array[Array[Int]]): Long = {
    (0 until 20).map(i => {
      val maxPerRow = grid(i).sliding(4).map(_.product).max
      val maxPerCol = (0 until 20).map(j => {
        grid(j)(i)
      }).sliding(4).map(_.product).max

      val diagMax: Long = if (i > 2) {
        val diagIndex = 19 - i
        val maxPerPosDiagonal = maxProduct((0 to i).map(j => grid(j)(i - j)))
        val maxPerPosDiagonal2 = maxProduct((0 to i).map(j => grid(diagIndex + j)(19 - j)))
        val maxPerNegDiagonal = maxProduct((0 to i).map(j => grid(diagIndex + j)(j)))
        val maxPerNegDiagonal2 = maxProduct((0 to i).map(j => grid(j)(diagIndex + j)))
        Seq(maxPerPosDiagonal, maxPerPosDiagonal2, maxPerNegDiagonal, maxPerNegDiagonal2).max
      } else 0l
      Seq(maxPerRow, maxPerCol, diagMax).max.asInstanceOf[Long]
    }).max
  }

  def maxProduct(array: Seq[Int], groupByFactor: Int = 4): Long = {
    array.sliding(groupByFactor).map(_.product).max
  }
}
