import com.pff.euler.Permutations

val prod = 0 :: (2 until 4).scanLeft(1)(_ * _).toList
val prodWithIdx = prod.zip("abcd".toCharArray.reverse)
val nth = 3 // 6
//val el = prod(prod.lastIndexWhere(_ <= nth))
//var i_1 = nth / el
//var rest_1 = nth % el
//val ifExis: Int = prod.lastIndexWhere(_ <= rest_1)
//val el_1 = prod(ifExis)
//var i_2 = rest_1 / el_1
//var rest_2 = rest_1 % el_1
//prod.lastIndexWhere(_ <= rest_2)
////val el_2 = prod(prod.lastIndexWhere(_ < rest_2))
////var i_3 = rest_2 / el_2
////var rest_3 = rest_2 % el_2
//(i_1, i_2, rest_2 )
//"c"


val allPerm = "abcd".permutations.toList.sorted
allPerm(15 + 1)
Permutations.nthPermutation2("abcd", 0)
val i: Int = prodWithIdx.lastIndexWhere(_._1 <= nth)
prodWithIdx.slice(i, prodWithIdx.length)
val shift = nth / prodWithIdx(i)._1
prod.scanRight((0, nth))((a, b) => {
  println(s"divide $a to $b")
  if(b._2 > 0) {
    (b._2 / a , b._2 % a)
  }
  else {
    (0, 0)
  }
//  (if(b._2 > 0 ) a / b._2 else 0, a%b._2)
}).dropRight(1).reverse
6/5