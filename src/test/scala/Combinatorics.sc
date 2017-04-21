import com.pff.euler.LatticePaths015
import com.pff.euler.CombinationsUtil._
combinations(4, 2)
combinations(5, 2)
combinations(6, 2)

combinations(8, 2)
combinations(10, 2)

val calc = new LatticePaths015
val paths22: List[String] = calc.bfs(2,2)
val paths32: List[String] = calc.bfs(3,2)
val paths33: List[String] = calc.bfs(3,3)
paths33.size
paths33.toSet.size

calc.pathsCount(2,2)
calc.pathsCount(4,4)
calc.pathsCount(5,5)
calc.pathsCount(6,4)


// total!/n!/m!
def combi(n: Int, m: Int): Long = {
  if (n > m)
    (m + 1 to (m + n)).product / (1 to m).product
  else
    (n + 1 to (m + n)).product / (1 to n).product
}
def combi_naive(n: Int, m: Int): Long = {
    val res: BigInt = (1 to (m + n)).map(BigInt(_)).product / (1 to m).map(BigInt(_)).product / (1 to n).map(BigInt(_)).product
    res % 1000000007 toLong
}


combi(2,2)
combi_naive(1,1)
combi_naive(386,123)

(1 to 112).map(BigInt(_)).product