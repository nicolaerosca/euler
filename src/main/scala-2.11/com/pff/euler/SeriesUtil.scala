package com.pff.euler

/**
 * @author nicolaerosca
 */
class SeriesUtil {

  /**
   * 1 + 2 + 3 + .. + n
   *
   * n(n+1)/2
   */
  def sum(n: Int): BigInt = {
    BigInt(n) * (n + 1) / 2
  }

  /**
   * 1^2 + 2^2 + 3^2 + .. + i^2
   *
   * n(n+1)(2n+1)/6
   */
  def sumOfSquares(n: Int): BigInt = {
    BigInt(n) * (n + 1) * (2 * n + 1) / 6
  }
}
