import com.pff.euler.Multiples001


val calc = new Multiples001
//calc.computeSumForN(1000000000)



(1 to 9/3).sum * 3
(1 to 9/5).sum * 5

def computeSumForN(n: Int): Long = {
  ( (1 to (n-1)/3).sum * 3).toLong + ((1 to (n-1)/5).sum * 5).toLong - ((1 to (n-1)/15).sum * 15).toLong
}


def computeSumForN2(n: Int): Long = {
  computeSumForNWithFactor((n-1)/3, 3) + computeSumForNWithFactor((n-1)/5, 5) - computeSumForNWithFactor((n-1)/15, 15)
}


def computeSumForNWithFactor(n: Int, factor: Int): Long = {
  n.toLong*(n + 1)/2 * factor
}

computeSumForN(100)
computeSumForN(10)
computeSumForN(1000000000)


computeSumForN2(10)
computeSumForN2(100)
computeSumForN2(1000000000)


def sum1(n: Int): Long = {
  (1 to (n-1)/15).sum
}

def sum2(n: Int): Long = {
  (n*(n + 1))/2
}
sum1(100000)
sum2(100000)

computeSumForNWithFactor(666666, 15)

sum1(66666)
(66666*(66666 + 1))/2

