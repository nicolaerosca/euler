package com.pff.euler

import org.scalatest.{Matchers, FlatSpec}

/**
 * @author nicolaerosca
 */
class HighlyDivisibleNumber012Test extends FlatSpec with Matchers {

  "Triangle > 4 " should " return 28" in {
    val cal = new HighlyDivisibleNumber012
    cal.computeForN(4) should be (28)
  }

  "Triangle > 999 " should " return fast" in {
    val cal = new HighlyDivisibleNumber012
    cal.computeForN(999) should be (842161320)
  }

  "Triangle with more parameters " should " return fast" in {
    val cal = new HighlyDivisibleNumber012
    cal.compute(Array(600, 200, 800, 300, 400, 999)) should be (Array(103672800l, 2031120l, 842161320l, 2162160l, 17907120l, 842161320l))
  }

}
