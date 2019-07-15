package com.knoldus.assignment.scala04

class Person(val name: String, val age: Int) extends Ordered[Person] {
  def compare(that: Person): Int = {
    if (this.name == that.name) {
      if (this.age > that.age ) {
        1
      }
      else {
        0
      }
    }
    else {
      if (this.name.length < that.name.length) {
        1
        if (this.name.length == that.name.length) {
          1
        }
      }
      1
    }
  }
}

object OrderdTrait extends App {
  val personOne = new Person("test", 30)
  val personTwo = new Person("test", 30)
  val personthree = new Person("test", 25)
  val statement = personOne<personthree
  println(statement)
  println(personthree.compare(personOne))

}

