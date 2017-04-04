package com.pff.euler

/**
 * @author nicolaerosca
 */
class LargestProduct008 {

  def largestProduct(k: Int, digit: String): Int = {
    val digitArray = digit.toCharArray.map(_.toString.toInt)
    digitArray.sliding(k).map(_.product).max
  }

  def compute(testCases: Array[(Int, String)]) : Array[Int] = {
    testCases.map(test => largestProduct(test._1, test._2))
  }
}
