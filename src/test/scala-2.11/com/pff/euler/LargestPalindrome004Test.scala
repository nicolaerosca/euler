package com.pff.euler

import org.scalatest.{Matchers, FlatSpec}

import scala.util.Random

/**
 * @author nicolaerosca
 */
class LargestPalindrome004Test extends FlatSpec with Matchers {

  "Find random palindrome " should "return exactly what brute force returns" in {
    val calc = new LargestPalindrome004

    val res = (0 to 100).map(x => Random.nextInt(1000000)).filter(_ > 101101)
    .map(testNum => (testNum, (calc.previousPalindrome(testNum), calc.previousPalindromeBruteForce(testNum))))

    res.map ({
      case ( randomTestCase: Int, (extValue: Int, realValue: Int)) => assertResult(extValue, s", for testCase $randomTestCase") {realValue}
      })

    true
  }
  "Find palindrome for 101110" should "return 101101" in {
    val calc = new LargestPalindrome004
    val res = calc.compute(Array(101110))
    res should be (Array(101101))
  }

  "Find palindrome for 800000" should "return 793397" in {
    val calc = new LargestPalindrome004
    val res = calc.compute(Array(800000))
    res should be (Array(793397))
  }
}
