package com.pff.euler

import scala.io.StdIn

/**
 * Example of solution class
 *
 * @author nicolaerosca
 */
object Solution2 {

  def main(args: Array[String]) {
    val si = StdIn

    val numberOfTestCases = si.readInt
    val testCases = (1 to numberOfTestCases).map(x => {
      val k_n = StdIn.readLine().split(" ").map(_.toInt)
      (k_n.last, StdIn.readLine())
    }).toArray

    val calculator = new LargestProduct008
    val result = calculator.compute(testCases)
    println(result.mkString("\n"))
  }
}
