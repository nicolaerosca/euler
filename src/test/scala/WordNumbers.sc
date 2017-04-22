import com.pff.euler.NumberToWords017
val x = "104382426112".toCharArray.map(_.toString).toList
val x2 = "382426112".toCharArray.map(_.toString).toList

var res = x match {
  case "1" :: mn :: t :: hn => "bn" + mn
  case _ => ""
}
val num = "104382426112"
val num2 = "10438242611".reverse
val pattern = "(\\d{3})".r

num.matches("[0-9]{3}")

pattern findAllMatchIn num2 toArray

x2.takeRight(6)

x2.take(x2.length - 6)

val calc = new NumberToWords017
calc.numberToWord("6000000")

