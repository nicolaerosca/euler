package com.pff.euler

import scala.collection.mutable

/**
 * @author nicolaerosca
 */
class MaxPrimeFactor003 {



  def calculateMaxPrime(n: Long): Long = {
    if (n % 2 == 0) {
      calculateMaxPrime(n / 2)
    }
    else {
      for (i <- 3l to math.sqrt(n).toLong by 2) {
        if (n % i == 0) {
          return calculateMaxPrime(n / i)
        }
      }
      n
    }
  }

  def compute(testCases: Array[Long]): Array[Long] = {
    testCases.map(calculateMaxPrime)
  }

}
