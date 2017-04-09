package com.pff.euler

import scala.io.StdIn

/**
 * Example of solution class
 *
 * @author nicolaerosca
 */
object Solution {

  def main(args: Array[String]) {
    val si = StdIn

    val numberOfTestCases = si.readInt
    val testCases = (1 to numberOfTestCases).map(x => StdIn.read).toArray

    val calculator = new EvenFibonacci002
    val result = calculator.compute(testCases)
    println(result.mkString("\n"))
  }
}
