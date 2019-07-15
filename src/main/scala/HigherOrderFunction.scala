package com.knoldus.assignment.scala04

class HigherOrderFunction {
  def getSum(f:(Int,Int)=>Int,number1:Int,number2:Int)={
    f(number1,number2)
  }
def getSumOfSquare(number1:Int,number2:Int):Int={
  number1*number1 + number2*number2
}
  def getSumOfCubes(number1:Int,number2:Int):Int= {
    number1 * number1 * number1 + number2 * number2 * number2
  }
    def getSumOfInts(number1:Int,number2:Int):Int={
      number1 + number2
    }
}
object HigherOrderFunction extends App{
  val higherorderobj=new HigherOrderFunction
  println(higherorderobj.getSum(higherorderobj.getSumOfSquare,2,3))
}