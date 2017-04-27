package com.pff.euler

/**
 * @author nicolaerosca
 */
class NamesScore022(inputNames: Array[String]) {

  val charPos: Map[Char, Int] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray.zip(1 to 27).toMap

  val nameToScore: Map[String, Int] = inputNames.view.sorted.zip(1 to inputNames.length + 1).map(p => (p._1, score(p._1) * p._2)).toMap

  def score(name: String): Int = {
    name.toCharArray.map(charPos).sum
  }

  def compute(names: Array[String]): Array[Int] = {
    names.map(nameToScore)
  }
}
