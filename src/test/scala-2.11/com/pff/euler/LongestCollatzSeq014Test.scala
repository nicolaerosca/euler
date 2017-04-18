package com.pff.euler

import org.scalatest.{Matchers, FlatSpec}

import scala.util.Random

/**
 * @author nicolaerosca
 */
class LongestCollatzSeq014Test extends FlatSpec with Matchers {

  "For n=9" should "have 19 steps" in {
    val calc = new LongestCollatzSeq014
    calc.getCollatz(9) should be (19)
  }

//  "For n=3732423" should "have 19 steps" in {
//    val calc = new LongestCollatzSeq014
//    calc.getCollatzRec(3732423) should be (19)
//  }

  "For n=19" should "have 19 steps" in {
    val calc = new LongestCollatzSeq014
    calc.getCollatz(18) should be (20)
  }

  "For n=10" should "return 9 with more steps" in {
    val calc = new LongestCollatzSeq014
    calc.maxCollatz(20) should be (19)
  }

  "For compute series" should "return Array(3, 9, 19)" in {
    val calc = new LongestCollatzSeq014
    calc.compute(Array(5, 10, 20)) should be (Array(3, 9, 19))
  }

  "For big n=5000000" should "return fast " in {
    val calc = new LongestCollatzSeq014
    calc.maxCollatz(5000000) should be (3732423)
    println(s"time loop ${calc.timeLoop}")
    println(s"time cache ${calc.timeCache}")
  }

  "For big lot of numbers " should "return fast " in {
    val calc = new LongestCollatzSeq014
    val testCases = (1 to 10000).map(_ => Random.nextInt(1000000)).toArray
    calc.compute(testCases)
    println(s"time loop ${calc.timeLoop}")
    println(s"time cache ${calc.timeCache}")
  }

}
