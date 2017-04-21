package com.pff.euler

import org.scalatest.{Matchers, FlatSpec}

import scala.util.Random

/**
 * @author nicolaerosca
 */
class LatticePaths015Test extends FlatSpec with Matchers {

  "For compute series Array((2,2), (3,2))" should "return Array(6, 10)" in {
    val calc = new LatticePaths015
    calc.compute(Array((2,2), (3,2))) should be (Array(6, 10))
  }

  "For big lot of numbers " should "return fast " in {
    val calc = new LatticePaths015
    val testCases = (1 to 10000).map(_ => {
      val n: Int = Random.nextInt(499) + 1
      val m: Int = Random.nextInt(499) + 1
      (n, m)
    }).toArray
    println(testCases.mkString(";"))
    calc.compute(testCases)
  }

}
