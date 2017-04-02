package com.pff.euler

/**
 * @author nicolaerosca
 */
class MaxPrimeFactor003 {

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
//            print("|" + j)
          }
        }
//        println()
    }

    lst.filter(_ != 0)
  }


}
