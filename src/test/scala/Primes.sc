import com.pff.euler.{PrimeNumbersUtil, MaxPrimeFactor003}

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

