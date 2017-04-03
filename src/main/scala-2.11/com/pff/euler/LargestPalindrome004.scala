package com.pff.euler

/**
 * @author nicolaerosca
 */
class LargestPalindrome004 {

  val palindromes = (101101 to 1000000 by 1).filter(this.isPalindrome)

  def isPalindrome(n: Int) : Boolean = {
    val str = n.toString
    if (str.length % 2 != 0) {
      false
    }
    else {
      val at: (String, String) = str.splitAt(str.length / 2)
      at._1 == at._2.reverse
    }
  }


  def previousPalindromeBruteForce(n: Int) : Int = {
//    (n to 100000 by -1).takeWhile(isPalindrome).last
    palindromes.takeWhile(_ < n).last
  }


  def previousPalindrome(n: Int): Int = {
//    val str = n.toString
//    val tuple: (String, String) = str.splitAt(str.length / 2)
//    val tup2 = if(tuple._2.endsWith("0")) tuple._2.substring(0, 2) + "1" else tuple._2
//    val pref = if(tuple._1.toInt >= tup2.reverse.toInt) (tuple._1.toInt - 1).toString else tuple._1
//
//    (pref + pref.reverse).toInt
    previousPalindromeBruteForce(n)
  }

  def isProductBy3DigitNum(n: Int): Boolean = {
    for(i <- 100 to 999) {
      if (n % i == 0) {
        val res = n / i
        if(res >= 100 && res <=999) {
          return true
        }
      }
    }
    // otherwise
    false
  }

  def compute(testCases: Array[Int]): Array[Int] = {
    testCases.map(n => {
      var prevPal = previousPalindrome(n)
      var found = false
      while(!found && prevPal >= 101101) {
        if(isProductBy3DigitNum(prevPal))
          found = true
        else
          prevPal = previousPalindrome(prevPal)
      }
      prevPal
    })
  }
}
