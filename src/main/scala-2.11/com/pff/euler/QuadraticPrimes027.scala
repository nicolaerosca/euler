package com.pff.euler

/**
 * @author nicolaerosca
 */
class QuadraticPrimes027 {

  val primes: Array[Int] = PrimeNumbersUtil.sieveOfEratosthenesBitSet(from = 2, to = 20000)
  val primeSet = primes.toSet

  def computePrimes(n: Int): IndexedSeq[((Int, Int), Int)] = {
    val b_val = primes.takeWhile(_ < n)

    for{
      a <- -n to n
      b <- b_val
    } yield ((a, b), computeNumPrimes(a, b))
  }

  /**
   * computes how many consecutive primes will generate
   * x**2 + a*x + b
   */
  def computeNumPrimes(a: Int, b: Int): Int = {
    var y = 0
    var x = 0
    do{
      y = x * x + a*x + b
      x += 1
    }
    while(isPrime(y))
    x
  }

  def isPrime(x: Int): Boolean = {
    primeSet.contains(x)
  }

}
