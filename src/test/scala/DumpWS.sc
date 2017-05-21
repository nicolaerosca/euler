import com.pff.euler.deepshit.LogNumber
//val calc = new EvenFibonacci002
//
//
//calc.fibonacci(100)
//
//calc.sumEvenFibonacci(10)
//calc.sumEvenFibonacci(100)
//calc.sumEvenFibonacci(1000)
//
//val maxNum: Long = 4 * Math.pow(10, 16).toLong
//
//val ar = Array(1, 2)
//
//calc.fibonacci(10)
//calc.fibonacci(100)
//calc.fibonacci(1000)
//calc.fibonacci(maxNum)
//
//BigInt("3324242342342342").toString().take(10).toLong
//BigInt("37107287533902102798797998220837590246510135740250").toString().take(10).toLong
//

(0 to 10).scanLeft(1)(_ + _)
//val cal2 = new NthFibonacciNum025
//cal2.generateFibonacciUpTo(100)
//val max = 5000
//val digNum = cal2.fibonacciNumberOfDigits(300)
//
//(1l until max).scanLeft((BigInt(1), BigInt(1)))((a,b) => (a._2, a._1 + a._2)).map(_._2)
//digNum.lastIndexWhere(_ < 3)

val num1 = new LogNumber(0)
val num2 = new LogNumber(0)
val num3 = num1 + num2
num3.power

val num4 = num2 + num3
