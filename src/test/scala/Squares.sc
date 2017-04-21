import com.pff.euler.SumSquareDifference006

val n = 10000l
var sum = (1l to n).sum
val res = (1l to n).map(i => {
  sum = sum - i
  i*sum
}).sum * 2
res > Int.MaxValue


val calc = new SumSquareDifference006

calc.computeForN(3)
calc.computeForN(10)
//calc.computeForN(10000)

1 to 10000 sum

var x = BigInt(2)
x.pow(10000).toString().toCharArray.map(_.toString.toInt).sum