package com.pff.euler

/**
 * @author nicolaerosca
 */
class PowerDigitSum016 {

  def getSum(n: Int): Int = {
    BigInt(2).pow(n).toString().toCharArray.map(_.toString.toInt).sum
  }

  def compute(testCases: Array[Int]) : Array[Int] = {
    testCases.map(getSum)
  }
}
