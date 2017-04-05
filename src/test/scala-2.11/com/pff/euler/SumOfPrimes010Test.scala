package com.pff.euler

import org.scalatest.{Matchers, FlatSpec}

import scala.util.Random

/**
 * @author nicolaerosca
 */
class SumOfPrimes010Test extends FlatSpec with Matchers {

  "Sum of primes " should " return right answers" in {
    val calc = new SumOfPrimes010

    val input: Array[Int] = Array(5, 10)
    calc.computeZip(input) should equal (Array(10l, 17l))
  }

  "Sum of primes " should " return exaclty like slow version" in {
    val calc = new SumOfPrimes010

    val input: Array[Int] = (1 to 100).map(_ => Random.nextInt(1000000)).toArray
    calc.computeZip(input) should equal (calc.compute(input))
  }

  "Sum of primes " should " be fast" in {
    val calc = new SumOfPrimes010

    val input = (1 to 10000).map(_ => Random.nextInt(1000000)).toArray
    calc.computeZip(input)
  }
}
