package com.pff.euler

import scala.io.StdIn

/**
 * Example of solution class with test cases on multiple lines
 * first line: matrix size m
 * next m lines matrix elements
 *
 * @author nicolaerosca
 */
object Solution4 {

  def main(args: Array[String]) {
    val si = StdIn

    val numberOfTestCases = si.readInt
    val testCases = (1 to numberOfTestCases).map(x => {
      val m = StdIn.readInt
      (1 to m).map(i => StdIn.readLine().split(" ").map(_.toInt)).toArray
    }).toArray

    val calculator = new MaxPathSum018
    val result = calculator.compute(testCases)
    println(result.mkString("\n"))
  }
}
