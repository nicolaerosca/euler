package com.pff.euler

import org.scalatest.{Matchers, FlatSpec}

/**
 * @author nicolaerosca
 */
class NumberToWords017Test extends FlatSpec with Matchers {

  "Test me " should "return Ten for 10 " in {
    val calc = new NumberToWords017
    val res = calc.numberToWord("10")
    val expect: String = "Ten"
    res should be (expect)
  }

  "Test me " should "return like in requirements " in {
    val calc = new NumberToWords017
    val res = calc.numberToWord("104382426112")
    val expect: String = "One Hundred Four Billion Three Hundred Eighty Two Million Four Hundred Twenty Six Thousand One Hundred Twelve"
    res should be (expect)
  }

  "Test me " should "not print millions if is empty " in {
    val calc = new NumberToWords017
    val res = calc.numberToWord("6000000000")
    val expect: String = "Six Billion "
    res should be (expect)
  }

  "Test me " should "not print thousands if is empty " in {
    val calc = new NumberToWords017
    val res = calc.numberToWord("6000000")
    val expect: String = "Six Million "
    res should be (expect)
  }

}
