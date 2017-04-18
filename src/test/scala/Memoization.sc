import com.pff.euler.LongestCollatzSeq014
import com.pff.euler.deepshit.MemoizationExample

val mem = new MemoizationExample

//mem.collatz(5742350)

//mem.isSubsetSumAchievable((1 to 1000).toList, 1)

//mem.editDistance((1 to 10000).toSeq, (10000 to 1 by -1).toSeq)
val calc = new LongestCollatzSeq014
calc.getCollatz(9)
val ar10 = (1 to 10).map(calc.getCollatz).toArray
calc.maxCollatz(5)
//calc.getCollatz(3732423)
//calc.getCollatz(381727)
//calc.collatzMM(5742350)
//calc.getCollatz(3732423)

ar10.zipWithIndex.sortBy(- _._1)

def search(arr: Array[(Int, Int)], from: Int, to: Int, elem: Int): Int = {
  if(arr(from)._2 > elem)
    throw new Exception("No such element exist!")
  if(to - from  < 2)
    arr(from)._1
  if(arr(from)._2 < elem)
    arr(to)._1

  arr(to)._1
}