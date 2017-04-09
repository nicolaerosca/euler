package com.pff.euler

import scala.collection.mutable.ListBuffer

/**
 * @author nicolaerosca
 */
class HighlyDivisibleNumber012 {

  def getTotalDivisors(n: Long): Int = {
    var count: Int = 0
    var i = 1
    var lowDiv = n
    //    val even = n % 2 == 0
    while (i < lowDiv) {
      if (n % i == 0) {
        val res = n / i
        if (res != i)
          count += 2
        else
          count += 1
        lowDiv = res
      }
      i += 1
    }
    count
  }

  def getDivisors(x: Long): ListBuffer[Long] = {
    val list = new ListBuffer[Long]()
    var i = 1l
    var lowDiv = x
    while (i < lowDiv) {
      if(x % i == 0) {
        val res = x / i
        list += i
        if(res != i)
          list += res
        lowDiv = res
      }
      i += 1
    }
    list.sorted
  }

  def sumN(n: Int): Long = {
    n.toLong * (n+1) / 2
  }

  def genTriangleSeries(n: Int) = {
    var sum = 0l
    (1 to n).map(x => {
      sum += x
      sum
    })
  }

  def computeForN(n: Int): Long = {
    var i = n
    var flag = true
    var sum = sumN(i)
    while (flag) {
      val devisors = getTotalDivisors(sum)
      if (devisors > n) {
        return sum
      }
      i += 1
      sum = sum + i
    }
    -1
  }

//  @scala.annotation.tailrec
//  final def computeForN(n: Int, i: Int = 1, sum: Long = 1): Long = {
//    val devisors = getTotalDivisors(sum)
//    if (devisors > n) {
//      return sum
//    }
//    val nextI: Int = i + 1
//    val nextSum: Long = sum + nextI
//    computeForN(n, nextI, nextSum)
//  }

  def compute(testCases: Array[Int]): Array[Long] = {
    testCases.map(computeForN(_))
  }

  def whiley[T](cond : =>Boolean)(body : =>T) : T = {
    @scala.annotation.tailrec
    def loop(previous : T) : T = if(cond) loop(body) else previous
    if(cond) loop(body) else throw new Exception("Loop must be entered at least once.")
  }
}
