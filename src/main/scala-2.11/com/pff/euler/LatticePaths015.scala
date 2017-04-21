package com.pff.euler

import scala.collection.mutable

/**
 * @author nicolaerosca
 */
class LatticePaths015 {
  
  def bfs(n: Int, m: Int): List[String] = {
    var res = List.empty[String]
    val queue = mutable.Queue.empty[String]
    queue.enqueue("00")
    while (queue.nonEmpty) {
      val path: String = queue.dequeue()
      val i = path.charAt(path.size-2).toString.toInt
      val j = path.charAt(path.size-1).toString.toInt
      if (i < n) {
        queue.enqueue(s"$path${i+1}$j")
      }
      if (j < m) {
        queue.enqueue(s"$path$i${j+1}")
      }
      if (i == n && j == m) {
        res =  path :: res
      }
    }
    res
  }

  def pathsCount(n: Int, m: Int): Long = {
    var count: Long = 0
    val queue = mutable.Queue.empty[(Int, Int)]
    queue.enqueue((0,0))
    while (queue.nonEmpty) {
      val tuple: (Int, Int) = queue.dequeue()
      if (tuple._1 < n) {
        queue.enqueue((tuple._1 + 1, tuple._2))
      }
      if (tuple._2 < m) {
        queue.enqueue((tuple._1, tuple._2 + 1))
      }
      if (tuple._1 == n && tuple._2 == m) {
        count += 1
      }
    }
    count
  }

  // total!/n!/m!
  def combi_naive(n: Int, m: Int): Long = {
    val res: BigInt = (1 to (m + n)).map(BigInt(_)).product / (1 to m).map(BigInt(_)).product / (1 to n).map(BigInt(_)).product
    res % 1000000007 toLong
  }

  def compute(testCases: Array[(Int, Int)]): Array[Long] = {
    testCases.map(x => combi_naive(x._1, x._2))
  }
}
