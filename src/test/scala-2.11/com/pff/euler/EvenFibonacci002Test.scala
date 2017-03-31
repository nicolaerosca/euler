package com.pff.euler

import org.scalatest.{Matchers, FlatSpec}

/**
 * @author nicolaerosca
 */
class EvenFibonacci002Test extends FlatSpec with Matchers {

  "For n=10" should "have sum 10" in {
    val calc = new EvenFibonacci002
    calc.fibonacci(10) should be (10)
  }

  "For n=100" should "have sum 44" in {
    val calc = new EvenFibonacci002
    calc.fibonacci(100) should be (44)
  }
}
