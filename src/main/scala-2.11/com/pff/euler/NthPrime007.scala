package com.pff.euler

/**
 * @author nicolaerosca
 */
class NthPrime007 {

  val primes = PrimeNumbersUtil.sieveOfEratosthenesBitSet(110000)

  def compute(testCases: Array[Int]): Array[Int] = {
    testCases.map(i => primes(i - 1))
  }
}
