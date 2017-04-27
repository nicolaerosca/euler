package com.pff.euler

/**
 * @author nicolaerosca
 */
class NonAbundantNums023 {

  val N = 100000
  private val abNum: Set[Int] = (2 to N).map(i => (i, DevisorsUtil.getDivisors(i).sum)).filter(x => x._1 < x._2).map(_._1).toSet

  def isSumOfAbundant(n: Int): Boolean = {
    val option = abNum.find(p => {
      if(p < n) {
        val px = n - p
        abNum.contains(px)
      }
      else
        false
    })
    option.isDefined
  }

  def compute(testCases: Array[Int]): Array[Boolean] = {
    testCases.map(isSumOfAbundant)
  }

}
