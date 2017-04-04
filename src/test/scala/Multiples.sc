import com.pff.euler.LargestProduct008

import scala.util.Random
val n1 = 36753
val n2 = 67535
val n3 = 75356
val n4 = 53562
val n5 = 35629
val n6 = 56291

val n = 3675356291l
n1.toString.charAt(0).toInt >= n2.toString.charAt(4).toInt
n2.toString.charAt(0).toInt >= n3.toString.charAt(4).toInt
n3.toString.charAt(0).toInt >= n4.toString.charAt(4).toInt
n4.toString.charAt(0).toInt >= n5.toString.charAt(4).toInt
n5.toString.charAt(0).toInt >= n6.toString.charAt(4).toInt
val arr = n.toString.toCharArray
val intArr = arr.map(_.toString.toInt)

intArr.sliding(5).map(_.product).max

var testArray = (1 to 1000).map(x => Random.nextInt(10))

testArray.sliding(7).map(_.product).max

val calc = new LargestProduct008
calc.largestProduct(5, "3675356291")
calc.largestProduct(5, "2709360626")

