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

  def sieveOfEratosthenesBitSet(from: Int = 2, to: Int ) = {
    val bits = mutable.BitSet.empty
    val thres = math.sqrt(to).toInt + 1
    for(i: Int <- 2 to thres) {
      if(!bits(i))
        for(j <- i * 2 to to by i) {
          if(!bits(j)) {
            bits.add(j)
          }
        }
    }

    (from to to).filterNot(bits(_)).toArray
  }


  // NOTE: not sure if is right
  def gaussianPrimes(n: Int): Int = {
    4 * n + 3
  }

  // NOTE: not sure if is right
  def gaussianPrimes2(n: Int): Int = {
    6 * n + 1
  }

  // NOTE: not sure if is right
  def gaussianPrimes3(n: Int): Int = {
    6 * n - 1
  }

  /**
   * should generate full reptend primes.
   *
   * A full reptend prime is a prime that will return (b**(p-1) - 1) / p a cyclic number
   *
   * https://en.wikipedia.org/wiki/Full_reptend_prime
   *
   */
  def generateFullReptendPrimes(N: Int) = {
    val primes = sieveOfEratosthenesBitSet(to = N)
    primes.filter(p => {
      val num = fermatQuotinet(p)
      if(num.isWhole())
        isCyclicNumber_bk(num, p)
      else
        false
    })
  }

  def generateFullReptendPrimes2(from: Int = 0, to: Int) = {
    val primes = sieveOfEratosthenesBitSet(from = from, to = to)
    primes.filter(isCyclicNumber)
  }


  /**
   * base 10
   */
  def fermatQuotinet(p: Int): BigInt = {
    val b = BigInt(10)
    (b.pow(p - 1) - 1)/p
  }


  /**
   * https://en.wikipedia.org/wiki/Cyclic_number
   *
   * this version is good but is very slow
   */
  def isCyclicNumber(p: Int): Boolean = {
    val b = 10
    var t = 0
    var r = 1
    do{
      t += 1
      val x = r * b
      r = x % p
      // Note that if t ever exceeds p/2, then the number must be cyclic
    }
    while (r != 1 && t <= p/2)

    val cyclic = t == p/2 + 1
    cyclic
  }

  /**
   * From properties of CyclicNumbers https://en.wikipedia.org/wiki/Cyclic_number
   *
   * When multiplied by their generating prime, results in a sequence of 'base−1' digits (9 in decimal). Decimal 142857 × 7 = 999999.
   * but not always correct, ex primes: 3, 11
   */
  def isCyclicNumber_bk(fermat: BigInt, prime: Int): Boolean = {
    (fermat * prime).toString().forall(_ == '9')
  }
}
