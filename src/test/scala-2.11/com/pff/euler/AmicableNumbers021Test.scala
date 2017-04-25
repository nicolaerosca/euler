package com.pff.euler

import org.scalatest.{Matchers, FlatSpec}

import scala.util.Random

/**
 * @author nicolaerosca
 */
class AmicableNumbers021Test extends FlatSpec with Matchers {

  "For n=300" should "have sum 504" in {
    val calc = new AmicableNumbers021
    calc.sumAmicableNumber(300) should be (504)
  }

  "For n=1200" should "have sum 1688" in {
    val calc = new AmicableNumbers021
    calc.sumAmicableNumber(1200) should be (504 + 1184)
  }

  "For T=1000" should " return fast" in {
    val calc = new AmicableNumbers021
    val testCases = (1 to 1000).map(_ => Random.nextInt(100000)).toArray

    calc.compute(testCases)
  }

}
