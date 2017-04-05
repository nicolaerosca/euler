package com.pff.euler

/**
 * @author nicolaerosca
 */
class PitagoraTriplets009 {

  val values = scala.collection.mutable.HashMap.empty[Int, (Int, Int, Int)]

  def init(n: Int) = {
    for(i <- 1 to n/3) {
      val i_sqr = i*i
      for(j <- i to n/2 + i) {
        val c: Double = math.sqrt(i_sqr + j * j)
        if(c.isWhole()){
          val sum = i + j + c.toInt
          values += ( sum -> (i, j, c.toInt) )
          //      println(s"$i, $j, $c, $sum")
        }
      }
    }
  }

  // max N
  init(3000)

  def computeForN(n: Int) : Int = {
    values.get(n) match {
      case Some(x) => x._1 * x._2 * x._3
      case None => -1
    }
  }

  def compute(testCases: Array[Int]): Array[Int] = {
    testCases.map(computeForN)
  }

}
