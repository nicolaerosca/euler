package com.pff.euler

import scala.annotation.tailrec
import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * @author nicolaerosca
 */
class LongestCollatzSeq014 {

  val arr = Array.ofDim[Int](5000001)

  val maxes = Array.ofDim[Int](5000001)
  var timeLoop = 0l
  var timeCache = 0l

  @tailrec
  final def getCollatzRec(n: Int, steps: Int = 0): Int = n match {
    case 1 => steps
    case even if n % 2 == 0 => getCollatzRec(n/2, steps + 1)
    case odd => getCollatzRec(3*n + 1, steps + 1)
  }

  final def getCollatz(n: Int): Int = {
    val cached = arr(n)
    if(cached != 0)
      return cached
    var steps: Int = 0
    var step: Long = n
    while(step != 1l) {
        step = if(step % 2 == 0) { // even
          steps += 1
          step / 2
        }
        else { //odd
          steps += 1
          3 * step + 1
        }
    }
    arr(n) = steps
    steps
  }

  def maxCollatz(n: Int): Int = {
    var maxCollatz = 1
    var maxIdx = 1
    for (x <- 3 to n) {
      val collX = getCollatz(x)
      if (collX >= maxCollatz) {
        maxCollatz = collX
        maxIdx = x
      }
      maxes(x) = maxIdx
    }
    maxIdx
  }

  def compute(testCases: Array[Int]): Array[Int] = {
    maxCollatz(5000000)
    testCases.map(maxes)
  }
}
