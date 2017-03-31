package com.pff.euler


import scala.io.StdIn

/**
 * @author nicolaerosca
 */
class Multiples001 {

  def computeSum(values: Array[Int]): Array[Int] =  {
    values.map(computeSumForN(_))
  }

  def computeSumForN(n: Int): Int = {
    var sum = 0
    for(i <- 0 until n) {
      if(i % 3 == 0 || i % 5 == 0) {
        sum+= i
      }
    }
    sum
  }

  def sum(n: Int, toBeMult: Int): Int = {
    if(n > 1)
      n*toBeMult + sum(n-1, toBeMult )
    else
      toBeMult
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