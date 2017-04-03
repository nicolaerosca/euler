package com.pff.euler

import scala.collection.mutable

/**
 * @author nicolaerosca
 */
class SmallestMultiple005() {

  val cache: mutable.Map[Int, List[Int]] = mutable.Map.empty ++ this.sieveOfEratosthenesBitSet(40).map(prime => (prime, List(prime))).toMap

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

  def computeForN(n: Int): Long = {
    val multiples: mutable.Map[Int, Int] = mutable.Map.empty
    (2 to n).foreach(i => {
      val multiForI = cache.getOrElse(i, findMultipleOfN(i))
      multiForI.groupBy(x => x).foreach{ case (num, elem: List[Int]) => {
        multiples.get(num) match {
          case None => multiples(num) = elem.size
          case Some(x: Int) => multiples(num) = math.max(x, elem.size)
        }
      }}
    })
//    println(multiples)
    multiples.foldLeft(1)((a: Int, b: (Int, Int)) => a * math.pow(b._1, b._2).toInt)
  }

  def findMultipleOfN(n: Int): List[Int] = {
//    println(s"job to do $n")
    cache.get(n) match {
      case None => {
        for (i: Int <- 2 until n) {
          if (n % i == 0) {
            val computedList: List[Int] =  List(i: Int) ++ findMultipleOfN(n / i)
            cache(n) = computedList
            return computedList
          }
        }
        List(n)
      }
      case Some(x: List[Int]) => x
    }
  }


  def compute(testCases: Array[Int]): Array[Long] = {
    testCases.map(computeForN)
  }

}
