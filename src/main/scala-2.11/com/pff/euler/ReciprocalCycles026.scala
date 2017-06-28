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

  // reptend primes have 1/p cycle p-1 digits number
  val reptentPrimes = 3 +: PrimeNumbersUtil.generateFullReptendPrimes2(from = 7, to = 10000)

  /**
   * Brute force
   *
   * @param n
   * @return
   */
//  def getRepeatingDecimal(n: Int): Option[String] = {
//      var prev = mutable.HashSet.empty[(Int, Int)]
//      var ix = List.empty[Int]
//      var digits: Option[String] = None
//
//      var remain = nominator
//      var flag: Boolean = true
//      while (flag) {
//        val shift = remain * 10
//        val res = shift / n
//        remain = shift % n
//        if (remain != 0) {
//          if (prev.contains((remain, res))) {
//            // terminate
//            digits = Some(ix.slice(ix.indexOf(res), ix.length).mkString)
//            flag = false
//          }
//          else {
//            // add
//            prev += ((remain, res))
//            ix = ix :+ res
//          }
//        }
//        else {
//          flag = false
//        }
//      }
//      digits
//  }

  def compute(testCases: Array[Int]): Array[Int] = {
    testCases.map(i => reptentPrimes.takeWhile(_ < i).last)
  }
}
