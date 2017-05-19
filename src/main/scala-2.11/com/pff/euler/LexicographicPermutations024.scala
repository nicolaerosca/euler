package com.pff.euler

/**
 * @author nicolaerosca
 */
class LexicographicPermutations024 {

  val DEFAULT: String = "abcdefghijklm"

  def nthPermutation(nth: Long): String = {
    nthPermutation(nth - 1, DEFAULT)
  }

  def nthPermutation(nth: Long, str: String): String = {
    // will build a index bucketing: (0-1, d), (1-2, c), (2-6, b), (6-24, a)
    // in this case we search for branch in the tree where index is there
    // because we are interested only in lower value, will store only that value in list
    val pd = 0l :: (2l until str.length).scanLeft(1l)(_ * _).toList

    // calculate shifts by dividing by nth and propagate reminder of division to leafs
    // if 0 no shift else shift i positions
    val shifts = pd.scanRight((0l, nth))((a, b) => {
      if (b._2 > 0) {
        (b._2 / a, b._2 % a)
      }
      else {
        (0, 0)
      }
    }).dropRight(1).reverse.map(_._1.toInt)

    var remStr = str
    var solution = ""

    for (i <- shifts) {
      solution = solution + remStr.charAt(i)
      remStr = remStr.substring(0, i) + remStr.substring(i + 1, remStr.length)
    }

    solution
  }

  def compute(testCases: Array[Long]): Array[String] = {
    testCases.map(nthPermutation)
  }
}
