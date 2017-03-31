import com.pff.euler.Multiples001

100/3


99/5


100/15

def sum(n: Int, toBeMult: Int): Int = {
  if(n > 1)
    n*toBeMult + sum(n-1, toBeMult)
  else if(n == 0)
    0
  else
    toBeMult
}

sum(19, 5)
sum(33, 3)
sum(6, 15)

def computeSum(n: Int): Int = {
  sum((n-1)/3, 3) + sum((n-1)/5, 5) - sum((n-1)/15, 15)
}

computeSum(100)
computeSum(10)

10/15


sum(0, 15)

val calc = new Multiples001
calc.computeSumForN(200)
computeSum(200)
