package com.pff.euler

/**
 * @author nicolaerosca
 */
object CombinationsUtil {

  // n!/(n-k)!k!
  def combinations(n: Int, k: Int): Long = {
    ((n-k+1) to n).product / (1 to k).product
  }

  // n!/(n-k)!
  def permutations(n: Int, k: Int): Long = {
    ((n-k+1) to n).product
  }
  
}
