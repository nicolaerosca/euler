import com.pff.euler.{DevisorsUtil, NamesScore022}

val calc = new NamesScore022(Array("ALEX", "LUIS", "JAMES", "BRIAN", "PAMELA"))

calc.nameToScore
calc.score("PAMELA")

"ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray.length

"ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray.zip(1 to 27).toMap




DevisorsUtil.getDivisors(18)

val xs = Array(true, false, true, false)

val xsB = xs.foreach(if (_) println("YES") else println("NO"))
//xsB.
(1l to 13l).product
(2l to 13l).scanLeft(1l)(_ * _)
val allPerm = "abcd".permutations.toList.sorted
allPerm(8)
//val allPermIdx = allPerm.map(s => s.toCharArray.map(charIdx).mkString(","))
val inp = "abcdefghijklm"
val xs2 = (0 to inp.length).zip(inp.length to 0 by -1).toMap
(inp.length to 0 by -1).zip(Array.ofDim[Int](inp.length)).toMap
//Permutations.nthPermutation1("", "abcd")
//Permutations.nthPermutation("abcd", 9)