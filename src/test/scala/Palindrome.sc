import com.pff.euler.LargestPalindrome004

val calc = new LargestPalindrome004
calc.isPalindrome(101101)
calc.isPalindrome(101102)

calc.previousPalindrome(101101)
calc.previousPalindrome(800000)
val strNum = "101101"
val str = 799997.toString
val tuple: (String, String) = str.splitAt(str.length / 2)

val tup2 = if(tuple._2.endsWith("0")) tuple._2.substring(0, 2) + "1" else tuple._2
val pref =
  if(tuple._1.toInt >= tup2.reverse.toInt) (tuple._1.toInt - 1).toString else tuple._1

tuple._1.toInt

  tup2.toInt
calc.isProductBy3DigitNum(793397)
calc.isProductBy3DigitNum(799997)



calc.previousPalindrome(799997)
calc.previousPalindrome(101110)
calc.previousPalindrome(101100)
calc.previousPalindrome(962530)


calc.isPalindrome(100001)


val palindromes = (101101 to 1000000 by 1).filter(calc.isPalindrome)

palindromes.takeWhile(_ < 962530).last
//calc.previousPalindromeBruteForce(101100)
