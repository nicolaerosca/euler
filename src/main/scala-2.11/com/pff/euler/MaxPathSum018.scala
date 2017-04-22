package com.pff.euler

/**
 * @author nicolaerosca
 */
class MaxPathSum018 {

  def maxPath(m: Array[Array[Int]], i: Int = 0, j: Int = 0): Int = {
    if (i < m.length) {
      val el = m(i)(j)
      val sum1 = el + maxPath(m, i + 1, j)
      val sum2 = el + maxPath(m, i + 1, j + 1)
      sum1 max sum2
    }
    else {
      0
    }
  }

  def compute(testCases: Array[Array[Array[Int]]]): Array[Int] = {
    testCases.map(maxPath(_))
  }
}
