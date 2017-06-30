package com.pff.euler

import org.scalatest.{Matchers, FlatSpec}

/**
 * @author nicolaerosca
 */
class NumberSpiralDiagonal028Test extends FlatSpec with Matchers {

  "Test cases (3,5) " should "return 25, 101 " in {
    val calc = new NumberSpiralDiagonal028
    val res = calc.compute(Array(3, 5))
    res should be (Array(25, 101))
  }

  "Test biggest number " should " run normal time " in {
    val calc = new NumberSpiralDiagonal028
    val res = calc.compute(Array(BigInt(10).pow(18).toLong))
    res should be (Array(500084652))
  }

}
