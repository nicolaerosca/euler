package com.pff.euler

import org.scalatest.{FlatSpec, Matchers}

import scala.util.Random

/**
 * @author nicolaerosca
 */
class NthFibonacciNum025Test extends FlatSpec with Matchers {

  "For N=3,4 " should "return 12,17 " in {
    val calc = new NthFibonacciNum025
//    calc.numberOfDigits(3) should be (12)

    calc.compute(Array(3, 4)) should be (Array(12,17))
    calc.compute(Array(4500)) should be (Array(21530))
  }

  "For N=5000 " should "return fast " in {
    val t0 = System.currentTimeMillis()
    val calc = new NthFibonacciNum025
    val t1: Long = System.currentTimeMillis
    println(t1 - t0)
    val testCases = (1 to 5000).map(x => Random.nextInt(4999) + 1).toArray
    val t2: Long = System.currentTimeMillis
    println(t2 - t1)
    calc.compute((1 to 5000).toArray)
    val t3: Long = System.currentTimeMillis
    println(t3 - t2)

  }



}
