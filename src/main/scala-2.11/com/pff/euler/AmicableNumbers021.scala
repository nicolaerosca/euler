package com.pff.euler

import scala.collection.immutable.IndexedSeq

/**
 * @author nicolaerosca
 */
class AmicableNumbers021 {

  private val N: Int = 100000
  val sumDivisors: IndexedSeq[Int] = (0 to N).map(DevisorsUtil.getDivisors(_).sum)

  val allAmicableNumb = amicableNumbers(N)

  def sumOfDevisors(n: Int): Int = {
    DevisorsUtil.getDivisors(n).sum
  }

  def sumAmicableNumber(n: Int): Int = {
    allAmicableNumb.takeWhile(_ < n).sum
  }

  def amicableNumbers(n: Int): Seq[Int] = {
    sumDivisors.view(0, n).flatMap(i => {
      if (i < n) {
        val amic = sumDivisors(i)
        if (i != amic) {
          val devAmic = if (amic < N) sumDivisors(amic) else DevisorsUtil.getDivisors(amic).sum
          if (devAmic == i)
            Some(i)
          else
            None
        }
        else
          None
      }
      else
        None
    }).toSet.toArray.sorted
  }

  def compute(testCases: Array[Int]): Array[Int] = {
    testCases.map(sumAmicableNumber)
  }
}
