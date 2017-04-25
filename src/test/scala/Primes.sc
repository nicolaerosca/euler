import com.pff.euler.{DevisorsUtil, MaxPrimeFactor003, PrimeNumbersUtil}

import scala.collection.immutable.IndexedSeq
import scala.util.Random

val calc = new MaxPrimeFactor003

val realBig: Long = math.pow(10, 12).toLong

math.pow(10, 12).toInt
math.pow(10, 12).toLong


val primes: Array[Int] = PrimeNumbersUtil.sieveOfEratosthenesBitSet(1000010)

primes.takeWhile(_ <= 5)
primes.takeWhile(_ <= 10).foldLeft(0l)(_ + _)
primes.takeWhile(_ <= 1000000).foldLeft(0l)(_ + _)

primes.last

Math.sqrt(10000)

val input = (1 to 10000).map(_ => Random.nextInt(1000000)).toArray

val res = (2 to 3).flatMap(x => {
  val i: Int = 10 % x
  if(i == 0) List(x, 10 / x) else None
})

val n = 1200

(1 to n).map(DevisorsUtil.getDivisors(_))

//(1 to n).map(DevisorsUtil.getDivisors(_).sum).groupBy(x => x).filter(x => x._2.size > 1).reduce((a1, a2) => a1._2.sum + a2._2.sum)

val N: Int = 100000
val sumDivisors: IndexedSeq[Int] = (0 to N).map(DevisorsUtil.getDivisors(_).sum)

sumDivisors.indexOf(1184)

val resNum = sumDivisors.view(0, n).flatMap(i => {
  if (i < n ) {
    val amic = sumDivisors(i)
    if (i != amic) {
      val devAmic = if (amic < N) sumDivisors(amic) else {println(amic); DevisorsUtil.getDivisors(amic).sum }
      if(devAmic == i)
        Some(i)
      else
        None
    }
    else
      None
  }
  else
    None
}).toSet

resNum.toArray.sorted
val net = List(220,284,1184,1210,2620,2924,5020,5564,6232,6368,10744, 10856,12285,14595,17296,18416,63020,66928,66992,67095, 69615,71145,76084,79750,87633,88730)


resNum.sum
net.sum
