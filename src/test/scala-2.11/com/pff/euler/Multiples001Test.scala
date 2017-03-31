package com.pff.euler

import org.scalatest._

import scala.collection.mutable


/**
 * @author nicolaerosca
 */
class Multiples001Test extends FlatSpec with Matchers {

  "A Stack" should "pop values in last-in-first-out order" in {
    val stack = new mutable.Stack[Int]
    stack.push(1)
    stack.push(2)
    stack.pop() should be (2)
    stack.pop() should be (1)
  }

  "For n=10 sum " should "be 23" in {
    val calculator = new Multiples001
    calculator.computeSumForN(10) should be (23)
  }


  "For n=100 sum " should "be 2318" in {
    val calculator = new Multiples001
    calculator.computeSumForN(10) should be (23)
  }

  "for and array input " should " have an array " in {
    val calculator = new Multiples001

    val res = calculator.computeSum(Array(10, 100))
    println(res.mkString("\n"))

    res(0) should be (23)
    res(1) should be (2318)
  }
}
