package com.pff.euler

import org.scalatest.{Matchers, FlatSpec}

/**
 * @author nicolaerosca
 */
class LexicographicPermutations024Test  extends FlatSpec with Matchers {

  "For 'abcd' nth = 8" should "return 'bcad'" in {
    val calc = new LexicographicPermutations024
    calc.nthPermutation(8l, "abcd") should be ("bcad")
  }

  "For 'abcd' nth = 3" should "return 'bcad'" in {
    val calc = new LexicographicPermutations024
    val allPerm = "abcd".permutations.toList.sorted

    calc.nthPermutation(3l, "abcd") should be (allPerm(3))
  }

  "For 'abcdefghijklm' nth = 1" should "return 'abcdefghijklm'" in {
    val calc = new LexicographicPermutations024
    calc.nthPermutation(1l) should be ("abcdefghijklm")
  }

  "For 'abcdefghijklm' nth = 2" should "return 'abcdefghijkml'" in {
    val calc = new LexicographicPermutations024
    calc.nthPermutation(2l) should be ("abcdefghijkml")
  }

}
