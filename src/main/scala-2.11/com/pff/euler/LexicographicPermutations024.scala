package com.pff.euler

/**
 * @author nicolaerosca
 */
class LexicographicPermutations024 {

  val DEFAULT: String = "abcdefghijklm"

  def nthPermutation(nth: Long): String = {
    nthPermutation(nth - 1, DEFAULT)
  }

  def nthPermutation(nth: Long, str: String): String = {
    val pd = (2l to str.length).scanLeft(1l)(_ * _).zipWithIndex
    var ix = nth - 1
    var remStr = str
    var solution = ""
    while(pd.lastIndexWhere(_._1 <= ix) > -1) {
      val el = pd(pd.lastIndexWhere(_._1 <= ix))
      val i = (ix / el._1).toInt
      ix = nth % el._1
      solution = solution + remStr.charAt(i)
      remStr = remStr.substring(0, i) + remStr.substring(i+1, remStr.length)
    }

    solution + remStr
  }
}
