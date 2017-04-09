package com.pff.euler

import scala.collection.mutable.ListBuffer

/**
 * @author nicolaerosca
 */
class HighlyDivisibleNumber012 {

  val primes = PrimeNumbersUtil.sieveOfEratosthenesBitSet(500400)

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

  /**
   * From number theory n=q^x * m^y => number of divisors is (x+1)(y+1); q and m are prime numbers
   * ex: 28 = 2^2 * 7^1 => (2+1)(1+1) = 6
   *
   * ToDo: functional style with recursion
   * @param n
   * @return
   */
  def getTotalDivisorsNumberTheory(n: Long): Int = {
    val primeAndPow = scala.collection.mutable.HashMap.empty[Int, Int]

    var remain = n
    while (remain != 1) {
      val firstPrime = primes.toStream.filter(remain % _ == 0).head
      val newPow: Int = if(primeAndPow.contains(firstPrime)) primeAndPow(firstPrime) else 0
      primeAndPow.put(firstPrime, 1 + newPow)
      remain = remain / firstPrime
    }

//    primes.takeWhile(_ < n).foreach(prime => {
//      if (n % prime == 0) {
//        val newMap: Map[Int, Int] = getTotalDivisorsNumberTheory(n / prime)
//        if (newMap.contains(prime)) newMap + (prime -> (1 + newMap(prime))) else newMap + (prime -> 1)
//      }
//    })

    primeAndPow.map(_._2 + 1).product
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
      val devisors = getTotalDivisorsNumberTheory(sum)
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
    val sorted: Array[(Int, Int)] = testCases.zipWithIndex.sortBy(_._1)
    val res = Array.ofDim[Long](testCases.length)
    var i = sorted.head._1
    sorted.foreach({ case (n: Int, index: Int) =>
      var flag = true
      var sum = sumN(i)
      while (flag) {
        val devisors = getTotalDivisorsNumberTheory(sum)
        if (devisors > n) {
          res(index) = sum
          flag = false
        }
        else {
          i += 1
          sum = sum + i
        }
      }
      -1
    })

    res
  }

  def whiley[T](cond : =>Boolean)(body : =>T) : T = {
    @scala.annotation.tailrec
    def loop(previous : T) : T = if(cond) loop(body) else previous
    if(cond) loop(body) else throw new Exception("Loop must be entered at least once.")
  }
}
