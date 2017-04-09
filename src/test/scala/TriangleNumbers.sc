import com.pff.euler.{PrimeNumbersUtil, HighlyDivisibleNumber012}

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


calc.getTotalDivisors(66)
calc.getDivisors(433)
calc.getTotalDivisorsNumberTheory(66)
timer(calc.sumN(1000000), calc.getTotalDivisors)
timer(calc.sumN(1000000), calc.getTotalDivisorsNumberTheory)
def timer(n: Long, f: Long => Int): Unit = {
  val t0=System.currentTimeMillis()
  println(f(n))
//  Thread.sleep(19)
  println(System.currentTimeMillis() - t0)
}

Array(103672800, 2031120, 842161320, 2162160, 17907120, 1465813440)
Array(103672800, 2031120, 842161320, 2162160, 17907120, 842161320)