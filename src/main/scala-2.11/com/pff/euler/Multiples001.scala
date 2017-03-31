package com.pff.euler


import scala.io.StdIn

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

  def computeSumForNWithFactor(n: Int, factor: Int): Long = {
    n.toLong*(n + 1)/2 * factor
  }
}


object Solution {

  def main(args: Array[String]) {
    val si = StdIn

    val numberOfTestCases = si.readInt
    val testCases = (1 to numberOfTestCases).map(x => StdIn.readInt).toArray

    val calculator = new Multiples001
    val result = calculator.computeSum(testCases)
    println(result.mkString("\n"))
  }
}