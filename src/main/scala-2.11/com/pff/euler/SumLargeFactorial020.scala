package com.pff.euler

/**
 * @author nicolaerosca
 */
class SumLargeFactorial020 {

  def sumDigitFactorial(n: Int): Int = {
    CombinationsUtil.factorial(n).toString().toCharArray.map(_.toString.toInt).sum
  }

  def compute(testCases: Array[Int]): Array[Int] = {
    testCases.map(sumDigitFactorial)
  }
}
