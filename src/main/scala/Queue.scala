package com.knoldus.assignment.scala04
trait Queue1 {
  def enqueue(list: List[Int], number: Int):List[Int]
  def dequeue(list:List[Int]):List[Int]={
    list.tail
  }

}
class DoubleQueue extends Queue1 {
  override def enqueue(list: List[Int],number: Int):List[Int] = {
    val double: Int = number * 2
    list :+double
  }
}

class SquareQueue extends Queue1 {
  override def enqueue(list: List[Int], number: Int):List[Int] ={
    val square: Int = number * number
    list :+square

  }
}

object Queue extends App {
  val obj = new DoubleQueue()
  val obj1 = new SquareQueue()
  val list = List.empty
  val list1=obj.enqueue(list, 4)
  val list2=obj1.enqueue(list1, 4)
  val list3= obj1.dequeue(list2)
  println(list2)
  println(list3)
}
