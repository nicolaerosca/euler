package com.pff.euler

import scala.collection.mutable

/**
 * @author nicolaerosca
 */
object PrimeNumbersUtil {

  /**
   * Generates prime numbers up to N
   * Naive implementation
   *
   * @param n
   * @return
   */
  def sieveOfEratosthenes(n: Int) = {
    val lst = (0 to n).toArray
    lst(1) = 0
    val thres = math.sqrt(n).toInt + 1
    for(i: Int <- 2 to thres) {
      if(lst(i) != 0)
      //        println(i)
        for(j <- i * 2 until lst.length by i) {
          if(lst(j) != 0) {
            lst(j) = 0
          }
        }
    }

    lst.filter(_ != 0)
  }

  def sieveOfEratosthenesBitSet(n: Int) = {
    val bits = mutable.BitSet.empty
    val thres = math.sqrt(n).toInt + 1
    for(i: Int <- 2 to thres) {
      if(!bits(i))
        for(j <- i * 2 to n by i) {
          if(!bits(j)) {
            bits.add(j)
          }
        }
    }

    (2 to n).filterNot(bits(_)).toArray
  }


  def gaussianPrimes(n: Int): Int = {
    4 * n + 3
  }

  def gaussianPrimes2(n: Int): Int = {
    6 * n + 1
  }
  def gaussianPrimes3(n: Int): Int = {
    6 * n - 1
  }
}
