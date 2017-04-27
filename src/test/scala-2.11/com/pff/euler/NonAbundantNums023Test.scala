package com.pff.euler

import org.scalatest.{Matchers, FlatSpec}

/**
 * @author nicolaerosca
 */
class NonAbundantNums023Test extends FlatSpec with Matchers {

  "For 24 " should "return YES " in {
    val calc = new NonAbundantNums023
    calc.isSumOfAbundant(24) should be (true)
    calc.isSumOfAbundant(22) should be (false)
    calc.isSumOfAbundant(49) should be (false)
  }


}
