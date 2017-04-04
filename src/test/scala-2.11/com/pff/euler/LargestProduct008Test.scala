package com.pff.euler

import org.scalatest.{Matchers, FlatSpec}

/**
 * @author nicolaerosca
 */
class LargestProduct008Test extends FlatSpec with Matchers {

  "For 3675356291 and k=5" should " have result " in {
    val calc = new LargestProduct008
    calc.largestProduct(5, "3675356291") should be (3150)
    calc.largestProduct(5, "2709360626") should be (0)
  }


}
