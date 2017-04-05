package com.pff.euler

import org.scalatest.{Matchers, FlatSpec}

/**
 * @author nicolaerosca
 */
class PitagoraTriplets009Test extends FlatSpec with Matchers {

  "For n=12 " should "return 60 " in {
    val calc = new PitagoraTriplets009
    calc.computeForN(12) should be (60)
  }

  it should " return -1 in case no pitagorean triplets" in {
    val calc = new PitagoraTriplets009

    calc.computeForN(4) should be (-1)
  }
}
