package com.pff.euler

import org.scalatest.{Matchers, FlatSpec}

/**
 * @author nicolaerosca
 */
class MaxPrimeFactor003Test  extends FlatSpec with Matchers {

  "Gen primes" should " be correct" in {
    val calc = new MaxPrimeFactor003
    val res = calc.sieveOfEratosthenes(100)

    res should be (Array(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97))
  }

  "Gen primes big numbers" should " finish" in {
    val calc = new MaxPrimeFactor003
    val res = calc.sieveOfEratosthenesBitSet(1000000000)

    res.last should be (999999937)
  }
}
