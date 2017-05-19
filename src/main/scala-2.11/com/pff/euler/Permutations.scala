package com.pff.euler

import scala.collection.mutable

/**
 * @author nicolaerosca
 */
object Permutations {

//  def permutations(str: String) = {
//    permutations("", str)
//  }
//

  def nthPermutation1(prefix: String, str: String) {
    val n: Int = str.length()
    if (n == 0)
      println(s">> $prefix, ")
    else {
      for (i <- 0 until n) {
//        print(str.charAt(i))
        println(s"${prefix + str.charAt(i)}, ${str.substring(0, i) + str.substring(i+1, n)}")
        nthPermutation1(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n))
      }
    }
  }


  /**
   * Crap !! .. not done but good start
   *
   * @param str
   * @param nth
   * @return
   */
  def nthPermutation(str: String, nth: Int): Option[String] = {
    val strChar = str.toCharArray
    var count = 0
    val n: Int = str.length()
    val queue = new mutable.Stack[(Array[Char], Int)]
    queue.push((strChar, 0))
    while (queue.nonEmpty) {
      val tuple: (Array[Char], Int) = queue.pop()
      val idx: Int = tuple._2
      val ar: Array[Char] = tuple._1
      if (idx == n - 1) {
        println(ar.mkString)
        count += 1
      }
      else {
        val tmpAr = Array.ofDim[Char](n)
        Array.copy(ar, 0, tmpAr, 0, idx)
        for (i <- idx until n) {
          val tmp = tmpAr(idx)
          tmpAr(idx) = ar(i)
          Array.copy(ar, idx + 1, tmpAr, idx, i - idx)
          Array.copy(ar, idx + 1, tmpAr, idx, i - idx)
          queue.push((tmpAr, idx + 1))
        }
      }
    }
    println(count)

    None
  }

  /**
   * This solution will check index of permutation and will go to tree branch of element
   * Index tree is basically every sequence of elements can generate n! combinations so I bucket based on character n buckets
   * based on these buckets I can check if that specific character has a shift or not.
   *
   * @param str
   * @param nth
   * @return
   */
  def nthPermutation2(str: String, nth: Long): Option[String] = {
    // will build a index bucketing: (0-1, d), (1-2, c), (2-6, b), (6-24, a)
    // in this case we search for branch in the tree where index is there
    // because we are interested only in lower value, will store only that value in list
    val pd = 0l :: (2l until str.length).scanLeft(1l)(_ * _).toList

    // calculate shifts by dividing by nth and propagate reminder of division to leafs
    // if 0 no shift else shift i positions
    val shifts = pd.scanRight((0l, nth))((a, b) => {
      if (b._2 > 0) {
        (b._2 / a, b._2 % a)
      }
      else {
        (0, 0)
      }
    }).dropRight(1).reverse.map(_._1.toInt)

    var remStr = str
    var solution = ""

    for (i <- shifts) {
      solution = solution + remStr.charAt(i)
      remStr = remStr.substring(0, i) + remStr.substring(i + 1, remStr.length)
    }

    Option(solution)
  }
}
