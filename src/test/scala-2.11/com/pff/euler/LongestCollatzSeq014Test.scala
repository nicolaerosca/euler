package com.pff.euler

import org.scalatest.{Matchers, FlatSpec}

/**
 * @author nicolaerosca
 */
class LongestCollatzSeq014Test extends FlatSpec with Matchers {

  "For n=9" should "have 19 steps" in {
    val calc = new LongestCollatzSeq014
    calc.getCollatz(9) should be (19)
  }

  "For n=19" should "have 19 steps" in {
    val calc = new LongestCollatzSeq014
    calc.getCollatz(19) should be (20)
  }

  "For n=10" should "return 9 with more steps" in {
    val calc = new LongestCollatzSeq014
    calc.maxCollatz(10) should be (9)
  }

  "For big n=5000000" should "return fast " in {
    val calc = new LongestCollatzSeq014
    calc.maxCollatz(5000000) should be (3732423)
  }

}
