package com.knoldus.assignment.scala04
case class FirstName(firstName: String) extends AnyVal {
  def getFirstName() = {
    firstName
  }
}

case class LastName(lastName: String) extends AnyVal {
  def getLastName() = {
    lastName
  }
}

case class Age(age: Int) extends AnyVal {
  def getAge() = {
    age
  }
}

object ValueClass extends App {
  val firstNameobj = new FirstName("Swapnil")
  val lastNameobj = new LastName("Gosavi")
  val ageobj = new Age(22)
  def displayDetails(firstName: FirstName, lastName: LastName, age: Age): Unit = {
    println(firstName.getFirstName() + " " + lastName.getLastName() + " is of " + age.getAge() + " year")
  }
  displayDetails(firstNameobj, lastNameobj, ageobj)
}