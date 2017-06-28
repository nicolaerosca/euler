package com.pff.euler

import com.pff.euler.deepshit.LogNumber

import scala.math.BigInt
import scala.collection.mutable

/**
 * @author nicolaerosca
 */
class NthFibonacciNum025 {

  val numberOfDigits = fibonacciNumberOfDigitsMap(25000)

  def generateFibonacciUpTo(max: Int): Seq[BigInt] = {
    List(BigInt(1), BigInt(1)) ++ (1l until max).scanLeft((BigInt(1), BigInt(1)))((a,b) => (a._2, a._1 + a._2)).map(_._2)
  }

  def fibonacciNumberOfDigits2(max: Int): Seq[Int] = {
    val arr = Array.ofDim[Int](max + 1)
    var n1 = new LogNumber(0)
    var n2 = new LogNumber(0)
    arr(1) = 1
    arr(2) = 1
    for(i <- 3 to max) {
      val nth = n1 + n2
      arr(i) = math.ceil(nth.power).toInt
      n1 = n2
      n2 = nth
    }
    arr
  }

  def fibonacciNumberOfDigits(max: Int): Seq[Int] = {
    generateFibonacciUpTo(max).map(_.toString().length)
  }

  def fibonacciNumberOfDigitsMap(max: Int): mutable.HashMap[Int, Int] = {
    val ints: Seq[Int] = fibonacciNumberOfDigits2(max)
    val digitNum = mutable.HashMap.empty[Int, Int]
    ints.view.zipWithIndex.foreach(p => {
      if (!digitNum.contains(p._1)) digitNum += p
    })
    digitNum
  }

  def compute(testCases: Array[Int]): Array[Int] = {
    testCases.map(i => {
      var iz = i
      while (numberOfDigits.get(iz).isEmpty && iz < 5000) {
        println(s"incr $iz")
        iz += 1
      }
      numberOfDigits(iz)
    })
  }
}
