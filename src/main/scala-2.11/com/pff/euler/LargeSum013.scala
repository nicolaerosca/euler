package com.pff.euler

/**
 * @author nicolaerosca
 */
class LargeSum013 {

  def sum(bigNumbers: Array[String]): Long = {
    bigNumbers.map(BigInt(_)).sum.toString().take(10).toLong
  }
}
