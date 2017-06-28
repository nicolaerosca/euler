package com.pff.euler

import scala.collection.mutable

/**
 * https://en.wikipedia.org/wiki/Repeating_decimal
 * https://en.wikipedia.org/wiki/Full_reptend_prime
 *
 *
 * @author nicolaerosca
 */
class ReciprocalCycles026 {

  val nominator = 1
  val N = 1000
//  val primes = PrimeNumbersUtil.sieveOfEratosthenesBitSet(10000).toSet
  val reptentPrimes = PrimeNumbersUtil.generateFullReptendPrimes2(10000)


  val digitsWithIndex: IndexedSeq[(Int, String)] = (1 until N).flatMap(i => {
    val op = getRepeatingDecimal(i)
    val res: Option[(Int, String)] = op match {
      case Some(x) => Some((i, x))
      case _ => None
    }
    res
  })


  /**
   * Brute force
   * 
   * @param n
   * @return
   */
  def getRepeatingDecimal(n: Int): Option[String] = {
//    if(primes.contains(n)) {
      var prev = mutable.HashSet.empty[(Int, Int)]
      var ix = List.empty[Int]
      var digits: Option[String] = None

      var remain = nominator
      var flag: Boolean = true
      while (flag) {
        val shift = remain * 10
        val res = shift / n
        remain = shift % n
        if (remain != 0) {
          if (prev.contains((remain, res))) {
            // terminate
            digits = Some(ix.slice(ix.indexOf(res), ix.length).mkString)
            flag = false
          }
          else {
            // add
            prev += ((remain, res))
            ix = ix :+ res
          }
        }
        else {
          flag = false
        }
      }
      digits
//    }
//    else
//      None
  }

  def compute(testCases: Array[Int]): Array[Int] = {
    testCases.map(i => digitsWithIndex.takeWhile(_._1 < i).maxBy(_._2)._1)
  }
}
