import com.pff.euler.MaxPathSum018

val m = Array.ofDim[Int](4, 4)

m(0)(0) = 3
m(1)(0) = 7
m(1)(1) = 4
m(2)(0) = 2
m(2)(1) = 4
m(2)(2) = 6
m(3)(0) = 8
m(3)(1) = 5
m(3)(2) = 9
m(3)(3) = 3


val calc = new MaxPathSum018
calc.maxPath(m)