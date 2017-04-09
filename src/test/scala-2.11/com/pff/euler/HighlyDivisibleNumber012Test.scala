package com.pff.euler

import org.scalatest.{Matchers, FlatSpec}

/**
 * @author nicolaerosca
 */
class HighlyDivisibleNumber012Test extends FlatSpec with Matchers {

  "Triagle > 4 " should " return 28" in {
    val cal = new HighlyDivisibleNumber012
    cal.computeForN(4) should be (28)
  }

  "Triagle > 999 " should " return fast" in {
    val cal = new HighlyDivisibleNumber012
    cal.computeForN(999) should be (842161320)
  }

}
