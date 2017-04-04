package com.pff.euler

/**
 * (a + b + c + d)**2 => a**2 + 2a(b+c+d) + (b+c+d)**2 => 2ab + 2ac + 2ad + 2bc + 2cd + 2bd + a**2 + b**2 + c**2 + d**2
 * cancel all squares (as per requirements)
 *
 * => 2*(ab + ac + ad + bc + cd + bd) => 2*(a(b+c+d) + b(c+d) + c*d)
 * @author nicolaerosca
 */
class SumSquareDifference006 {

//  def computeForN(n: Int): Long = {
//    (1 to n).combinations(2).map(2 * _.product).sum
//  }

  def computeForN(n: Long): Long = {
    var sum = (1l to n).sum
    (1l to n.toLong).map(i => {
      sum = sum - i
      i*sum
    }).sum * 2
  }

  def compute(testCases: Array[Long]): Array[Long] = {
    testCases.map(computeForN)
  }

}
