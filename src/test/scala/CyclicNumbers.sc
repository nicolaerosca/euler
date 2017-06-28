/**
Let b be the number base (10 for decimal)
Let p be a prime that does not divide b.
Let t = 0.
Let r = 1.
Let n = 0.
loop:

Let t = t + 1
Let x = r · b
Let d = int(x / p)
Let r = x mod p
Let n = n · b + d
If r ≠ 1 then repeat the loop.
if t = p − 1 then n is a cyclic number.
 **/

val b = 10
val p = 23
var t = 0
var r = 1
var n = 0

do{
  t += 1
  val x = r * b
//  val d = (x / p).toInt
  r = x % p
  println(r, t)
//  n = n * b + d
}
//while (t <= p/2 + 1)
while (r != 1 && t <= p/2)
val cyclic = t == p/2 + 1
p/2