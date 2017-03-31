package com.pff.euler

import scala.io.StdIn

/**
 * By considering the terms in the Fibonacci sequence whose values do not exceed,
 * find the sum of the even-valued terms.
 *
 * @author nicolaerosca
 */
class EvenFibonacci002 {

  def compute(testCases: Array[Long]): Array[Long] = {
    testCases.map(fibonacci)
  }

  def sumEvenFibonacci(n: Long): Long = {
    fibonacci(n)
  }

//  def fibonacci(n: Long): Array[Int] = {
//    val fibSeq = mutable.MutableList(1, 2)
//    var nextFib = 3
//    while (nextFib < n) {
//      fibSeq += nextFib
//      nextFib = fibSeq(fibSeq.size - 2) + fibSeq.last
//    }
//    fibSeq.toArray
//  }

  def fibonacci(n: Long): Long = {
    var a: Long = 1
    var b: Long = 1
    var nextFib: Long = 2
    var sum: Long = 0
    while (nextFib < n) {
      a = b
      b = nextFib
      if (nextFib % 2 == 0) {
        sum+= nextFib
      }
      nextFib = a + b
    }
    sum
  }
}

object Solution {

  def main(args: Array[String]) {
    val si = StdIn

    val numberOfTestCases = si.readInt
    val testCases = (1 to numberOfTestCases).map(x => StdIn.readLong).toArray

    val calculator = new EvenFibonacci002
    val result = calculator.compute(testCases)
    println(result.mkString("\n"))
  }
}