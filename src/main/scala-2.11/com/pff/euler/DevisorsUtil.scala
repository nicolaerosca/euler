package com.pff.euler

/**
 * @author nicolaerosca
 */
object DevisorsUtil {


  /**
   * Return divisors of n.
   *
   * Note: except n
   * @param n
   * @return
   */
  def getDivisors(n: Int): Seq[Int] = {
    (2 to math.sqrt(n).toInt).flatMap(x => {
      if(n % x == 0) List(x, n / x) else None
    }) :+ 1
  }
}
