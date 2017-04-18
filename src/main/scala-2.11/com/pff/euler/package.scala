package com.pff

/**
 * @author nicolaerosca
 */
package object euler {

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

  def t(f: => Any) { val start = System.currentTimeMillis; val res = f; println("Time: " + (System.currentTimeMillis - start) + "ms"); res}

}
