package com.pff.euler

/**
 * TODO: remove list of strings and process directly the string
 *
 * @author nicolaerosca
 */
class NumberToWords017 {

  val map = Map("1" -> "One", "2" -> "Two", "3" -> "Three", "4" -> "Four", "5" -> "Five", "6" -> "Six", "7" -> "Seven", "8" -> "Eight", "9" -> "Nine", "10" -> "Ten",
  "11" -> "Eleven", "12" -> "Twelve", "13" -> "Thirteen", "14" -> "Fourteen", "15" -> "Fifteen", "16" -> "Sixteen", "17" -> "Seventeen", "18" -> "Eighteen", "19" -> "Nineteen", "20" -> "Twenty",
  "30" -> "Thirty", "40" -> "Forty", "50" -> "Fifty", "60" -> "Sixty", "70" -> "Seventy", "80" -> "Eighty", "90" -> "Ninety")


  def numberToWordList(num: List[String]): String = num match  {
    case _ if num.length > 9 => s"${numberToWordList(num.take(num.length - 9))} Billion ${numberToWordList(num.takeRight(9))}"
    case _ if num.length > 6 => {
      var mn: String = numberToWordList(num.take(num.length - 6))
      mn = if(mn.nonEmpty) mn + " Million " else mn
      val rest: String = numberToWordList(num.takeRight(6))
      s"$mn$rest"
    }
    case _ if num.length > 3 => {
      var thousands = numberToWordList(num.take(num.length - 3))
      thousands = if (thousands.nonEmpty) thousands + " Thousand " else thousands
      val rest: String = numberToWordList(num.takeRight(3))
      s"$thousands$rest"
    }
    case "0" :: xs if num.length == 3 => s"${numberToWordList(xs)}"
    case x :: xs if num.length == 3 => s"${map(x)} Hundred ${numberToWordList(xs)}"
    case List("0", "0") => ""
    case List("0", y) => s"${map(y)}"
    case List("1", y) => s"${map("1" + y)}"
    case List(x, "0") => s"${map(x + "0")}"
    case List(x, y) => s"${map(x + "0")} ${map(y)}"
    case x :: Nil => s"${map(x)}"
  }


  def numberToWord(num: String): String = {
    numberToWordList(num.toCharArray.map(_.toString).toList)
  }

  def compute(testCases: Array[String]): Array[String] = {
    testCases.map(numberToWord)
  }
}
