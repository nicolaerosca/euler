package com.pff.euler

import org.scalatest.{Matchers, FlatSpec}

/**
 * @author nicolaerosca
 */
class LargeSum013Test extends FlatSpec with Matchers {

  "Sum " should " be correct" in {
    val calc = new LargeSum013

    val testCases = Array("37107287533902102798797998220837590246510135740250",
      "46376937677490009712648124896970078050417018260538",
      "74324986199524741059474233309513058123726617309629",
      "91942213363574161572522430563301811072406154908250",
      "23067588207539346171171980310421047513778063246676")
    calc.sum(testCases) should be (2728190129l)
  }

}
