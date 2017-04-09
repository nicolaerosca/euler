import com.pff.euler.HighlyDivisibleNumber012

import scala.collection.mutable.ListBuffer

val calc = new HighlyDivisibleNumber012



//val triangle100 = genTriangleSeries(100)


//genTriangleSeries(100).map(x => {
//  (1l to x).flatMap(i => if (x % i == 0) Some(i) else None)
//})


calc.genTriangleSeries(10000).map(x => {
  calc.getDivisors(x)
})
calc.genTriangleSeries(1000).last
calc.getTotalDivisors(calc.sumN(7))

//var i = 1
//var flag = true
//while (flag) {
//  val devisors = calc.getTotalDivisors(calc.sumN(i))
//  if (devisors > 990) {
//    println(s"Holy grail !!! $i")
//    flag = false
//  }
//  i += 1
//}


def computeForN(n: Int, i: Int = 1): Int = {
  val devisors = calc.getTotalDivisors(calc.sumN(i))
  if (devisors > n) {
    return n
  }
  computeForN(n, i + 1)
}

def computeForN2(n: Int): Long = {
  var i = 1
  var flag = true
  var sum = 1
  while (flag) {
    println(sum)
    val devisors = calc.getTotalDivisors(sum)
    if (devisors > n) {
      return sum
    }
    i += 1
    sum = sum + i
  }
  -1
}
calc.getTotalDivisors(28)
calc.getDivisors(28)

computeForN2(4)
calc.sumN(1000)