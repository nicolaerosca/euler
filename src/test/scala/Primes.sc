import com.pff.euler.PrimeNumbersUtil

//PrimeNumbersUtil.generateFullReptendPrimes(1000)
PrimeNumbersUtil.generateFullReptendPrimes2(10000)


val r19 = PrimeNumbersUtil.fermatQuotinet(19)
PrimeNumbersUtil.isCyclicNumber_bk(BigInt("588235294117647"), 17)
val p = 223

val b = BigInt(10)
val r = (b.pow(p-1) - 1) / p

r*2
r*3
r*4
r*5
r*6
//r* (r.toString().length + 2)
r*2

PrimeNumbersUtil.isCyclicNumber(17)

var r_1 = r * p
r_1.toString().toCharArray.groupBy(x => x).mapValues(_.size)
r_1.toString().forall(_ == '9')