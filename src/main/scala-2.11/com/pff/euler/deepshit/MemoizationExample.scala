package com.pff.euler.deepshit

import scala.annotation.tailrec

/**
 * http://stackoverflow.com/questions/25129721/scala-memoization-how-does-this-scala-memo-work
 *
 * @author nicolaerosca
 */
class MemoizationExample {

  case class Memo[I <% K, K, O](f: I => O) extends (I => O) {
    import collection.mutable.{Map => Dict}
    type Input = I
    type Key = K
    type Output = O
    val cache = Dict.empty[K, O]
    override def apply(x: I) = cache getOrElseUpdate (x, f(x))
  }

  object Memo {
    /**
     * Type of a simple memoized function e.g. when I = K
     */
    type ==>[I, O] = Memo[I, I, O]
  }

  /**
   * Subset sum algorithm - can we achieve sum t using elements from s?
   * O(s.map(abs).sum * s.length)
   *
   * @param s set of integers
   * @param t target
   * @return true iff there exists a subset of s that sums to t
   */
  def isSubsetSumAchievable(s: List[Int], t: Int): Boolean = {
    type I = (List[Int], Int)     // input type
    type K = (Int, Int)           // cache key i.e. (list.size, int)
    type O = Boolean              // output type

    type DP = Memo[I, K, O]

    // encode the input as a key in the cache i.e. make K implicitly convertible from I
    implicit def encode(input: DP#Input): DP#Key = (input._1.length, input._2)

    lazy val f: DP = Memo {
      case (Nil, x) => x == 0      // an empty sequence can only achieve a sum of zero
      case (a :: as, x) => f(as, x - a) || f(as, x)      // try with/without a.head
    }

    f(s, t)
  }

  /**
   * Calculate edit distance between 2 sequences
   * O(s1.length * s2.length)
   *
   * @return Minimum cost to convert s1 into s2 using delete, insert and replace operations
   */
  def editDistance[A](s1: Seq[A], s2: Seq[A]) = {

    type DP = Memo[(Seq[A], Seq[A]), (Int, Int), Int]
    implicit def encode(key: DP#Input): DP#Key = (key._1.length, key._2.length)

    lazy val f: DP = Memo {
      case (a, Nil) => a.length
      case (Nil, b) => b.length
      case (a :: as, b :: bs) if a == b => f(as, bs)
      case (a, b) => 1 + (f(a, b.tail) min f(a.tail, b) min f(a.tail, b.tail))
    }

    f(s1, s2)
  }

  def collatz(inp: Int): Int = {
    type I = (Int, Int)     // input type
    type K = Int     // cache key i.e. int
    type O = Int     // output type

    type DP = Memo[I, K, O]
    implicit def encode(key: DP#Input): DP#Key = key._1

    lazy val f: DP = Memo {
        case (1, steps) => steps
        case (n, steps) if n % 2 == 0 => f(n/2, steps + 1)
        case (n, steps) => f(3*n + 1, steps + 1)
    }

    f((inp, 0))
  }

  def maxCollatz(n: Int): Int = {
    (3 to n).fold(1){ case (max, x) => math.max(max, collatz(x))}
  }

}
