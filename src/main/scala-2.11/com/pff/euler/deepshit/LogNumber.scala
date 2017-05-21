package com.pff.euler.deepshit

/**
 * @author nicolaerosca
 */
class LogNumber(val power: Double) {

  def this(other: LogNumber) {
    this(other.power)
  }

  def +(other: LogNumber) : LogNumber = {
    val powDiff = - math.abs(power - other.power)
    val newPrincipal = 1 + math.pow(10, powDiff)
    val powAdd = math.log10(newPrincipal)
    new LogNumber(math.max(power, other.power) + powAdd)
  }


  def toNum(): Double = {
    math.pow(10, power)
  }

  override def toString(): String = {
    toNum().toString
  }
}
