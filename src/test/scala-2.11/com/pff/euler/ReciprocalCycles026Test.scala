package com.pff.euler

import org.scalatest.{Matchers, FlatSpec}

/**
 * @author nicolaerosca
 */
class ReciprocalCycles026Test extends FlatSpec with Matchers {

  "Get some repetitions " should " return right answers" in {
    val calc = new ReciprocalCycles026

    calc.getRepeatingDecimal(2) should equal (None)
    calc.getRepeatingDecimal(3) should equal (Some("3"))
    calc.getRepeatingDecimal(4) should equal (None)
    calc.getRepeatingDecimal(6) should equal (Some("6"))
    calc.getRepeatingDecimal(7) should equal (Some("142857"))
    calc.getRepeatingDecimal(9) should equal (Some("1"))
    calc.getRepeatingDecimal(17) should equal (Some("0588235294117647"))
    calc.getRepeatingDecimal(19) should equal (Some("052631578947368421"))
  }

  "Invoking compute() " should " calculate max digit" in {
    val calc = new ReciprocalCycles026

    calc.compute(Array(5, 10)) should equal (Array(3, 7))
  }
}
