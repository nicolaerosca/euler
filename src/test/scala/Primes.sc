import com.pff.euler.{PrimeNumbersUtil, MaxPrimeFactor003}

def gaussianPrimes(n: Int): Int = {
  4 * n + 3
}

def gaussianPrimes2(n: Int): Int = {
  6 * n + 1
}
def gaussianPrimes3(n: Int): Int = {
  6 * n - 1
}

val calc = new MaxPrimeFactor003
//calc.sieveOfEratosthenes(1000)
//calc.sieveOfEratosthenesBitSet(100)

//
//gaussianPrimes2(1)
//gaussianPrimes2(2)
//gaussianPrimes3(2)
//gaussianPrimes3(3)
//gaussianPrimes2(3)
//gaussianPrimes2(4)
//gaussianPrimes3(4)
//gaussianPrimes2(5)
//gaussianPrimes2(6)
//gaussianPrimes2(7)
//
//13195%2
//13195%3
//13195%5
//
//13195/5 % 2
//13195/5 % 3
//13195/5 % 5
//13195/5 % 7
//13195/5/7
//
//13195/5/7 % 2
//13195/5/7 % 3
//13195/5/7 % 5
//13195/5/7 % 7
//13195/5/7 % 11
//13195/5/7 % 13
//
//13195/5/7/13
//
//13195/29

val realBig: Long = math.pow(10, 12).toLong

calc.calculateMaxPrime(10)
calc.calculateMaxPrime(13195)
calc.calculateMaxPrime(999999937l)
math.pow(10, 12).toInt
math.pow(10, 12).toLong


