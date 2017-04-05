import scala.collection.parallel.mutable

3*3
4*4
5*5
//8*8
6*6
7*7
8*8
9*9
11*11
12*12



val d = math.sqrt(9)

d.isWhole

5.0d.isWhole()

val n = 3000

val values = scala.collection.mutable.HashMap.empty[Int, (Int, Int, Int)]
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

values.get(3002)
