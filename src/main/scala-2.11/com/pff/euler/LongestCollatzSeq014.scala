package com.pff.euler

import scala.annotation.tailrec
import scala.collection.mutable

/**
 * @author nicolaerosca
 */
class LongestCollatzSeq014 {

  val cache = mutable.HashMap.empty[Long, Int]

  @tailrec
  final def getCollatzRec(n: Int, steps: Int = 0): Int = n match {
    case 1 => steps
    case even if n % 2 == 0 => getCollatzRec(n/2, steps + 1)
    case odd => getCollatzRec(3*n + 1, steps + 1)
  }

  final def getCollatz(n: Int): Int = {
    var steps: Int = 0
    var step: Long = n
    var flag = true
    while(flag) {
      step = step match {
        case 1 => {
          flag = false
          steps
        }
        case cached if cache.contains(step) => cache(step)
        case even if step % 2 == 0 => {
          steps += 1
          step / 2
        }
        case odd => {
          steps += 1
          3 * step + 1
        }
      }
    }
    cache + (step -> steps)
    steps
  }
  
  def maxCollatz(n: Int): Int = {
    (3 to n).map(x => (x, getCollatz(x))).sortBy(_._2).last._1
  }

  def compute(testCases: Array[Int]): Array[Int] = {
    testCases.map(maxCollatz)
  }
}
