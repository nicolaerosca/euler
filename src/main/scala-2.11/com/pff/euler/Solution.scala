package com.pff.euler

/**
 * Example of solution class
 *
 * @author nicolaerosca
 */
object Solution {

  def main(args: Array[String]) {
    val si = scala.io.StdIn

    val numberOfTestCases = si.readInt
    val testCases = (1 to numberOfTestCases).map(x => scala.io.StdIn.readLong).toArray

    val calculator = new EvenFibonacci002
    val result = calculator.compute(testCases)
    println(result.mkString("\n"))
  }
}
