package com.pff.euler

import scala.io.StdIn

/**
 * Example of solution class with test cases a pair split by 'space' (k,n)
 *
 * @author nicolaerosca
 */
object Solution3 {

  def main(args: Array[String]) {
    val si = StdIn

    val numberOfTestCases = si.readInt
    val testCases = (1 to numberOfTestCases).map(x => {
      StdIn.readLine().split(" ") match {
        case Array(x: String, y: String) => (x.toInt, y.toInt)
      }
    }).toArray

    val calculator = new LatticePaths015
    val result = calculator.compute(testCases)
    println(result.mkString("\n"))
  }
}
