package com.pff.euler

import org.scalatest.{Matchers, FlatSpec}

/**
 * @author nicolaerosca
 */
class NamesScore022Test extends FlatSpec with Matchers {

  "Got it " should "return 240 " in {
    val calc = new NamesScore022(Array("ALEX", "LUIS", "JAMES", "BRIAN", "PAMELA"))
    val res = calc.compute(Array("PAMELA"))
    res should be (Array(240))
  }



}
