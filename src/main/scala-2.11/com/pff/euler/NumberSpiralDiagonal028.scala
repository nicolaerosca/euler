package com.pff.euler

/**
 * @author nicolaerosca
 */
class NumberSpiralDiagonal028 {

  def getSum(N: Long): BigInt = {
//    var nt = BigInt(1)
//    for (i <- 1l to n/2) {
//      nt = nt + (16 * i * i + 4 * i + 4)
//    }
    val n = N/2
    val sum = 1 + 4 * BigInt(n) + 2*BigInt(n)*(n+1) + BigInt(8) * n * (n + 1) * (2*n + 1)/3
    sum
  }


  def compute(arr: Array[Long]): Array[Long] = {
    arr.map(x => getSum(x) % 1000000007 toLong)
  }
}
