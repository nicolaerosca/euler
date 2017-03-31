package com.pff.euler


/**
 * Find the sum of all the multiples of  or  below .
 *
 * @author nicolaerosca
 */
class Multiples001 {

  def computeSum(values: Array[Int]): Array[Long] =  {
    values.map(computeSumForN)
  }

  def computeSumForN(n: Int): Long = {
    computeSumForNWithFactor((n-1)/3, 3) + computeSumForNWithFactor((n-1)/5, 5) - computeSumForNWithFactor((n-1)/15, 15)
  }

  /**
   * 1 + 2 + 3 + ... + n -> n * ( n + 1 ) / 2
   *
   * @param n
   * @param factor
   * @return
   */
  def computeSumForNWithFactor(n: Int, factor: Int): Long = {
    n.toLong*(n + 1)/2 * factor
  }
}


