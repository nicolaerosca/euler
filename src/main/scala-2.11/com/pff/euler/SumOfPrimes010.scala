package com.pff.euler

/**
 * @author nicolaerosca
 */
class SumOfPrimes010 {

  val primes = PrimeNumbersUtil.sieveOfEratosthenesBitSet(to = 1000010)

  def compute(testCases: Array[Int]): Array[Long] = {
    testCases.map(i => primes.takeWhile(_ <= i).foldLeft(0l)(_ + _))
  }

  def computeZip(testCases: Array[Int]) : Array[Long] = {
    val sortedTuples: Array[(Int, Int)] = testCases.zipWithIndex.sortBy(_._1)
    var sum = 0l
    var lastIndex = 0
    val res = Array.ofDim[Long](testCases.length)
    for (pair <- sortedTuples) {
      var flag = true
      var i = lastIndex
      while (flag) {
        val prime = primes(i)
        if (prime > pair._1) {
          res(pair._2) = sum
          lastIndex = i
          flag = false
        }
        else {
          sum += prime
        }
        i += 1
      }
    }
    res
  }

}
