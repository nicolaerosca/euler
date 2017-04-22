package com.pff.euler

import org.scalatest.{Matchers, FlatSpec}

/**
 * @author nicolaerosca
 */
class MaxPathSum018Test extends FlatSpec with Matchers {

  "For n=9" should "have 19 steps" in {
    val calc = new MaxPathSum018
    val m = Array.ofDim[Int](4, 4)

    m(0)(0) = 3
    m(1)(0) = 7
    m(1)(1) = 4
    m(2)(0) = 2
    m(2)(1) = 4
    m(2)(2) = 6
    m(3)(0) = 8
    m(3)(1) = 5
    m(3)(2) = 9
    m(3)(3) = 3

    calc.maxPath(m) should be (23)
  }

}
