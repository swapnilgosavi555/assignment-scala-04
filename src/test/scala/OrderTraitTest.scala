import org.scalatest.FunSuite
import com.knoldus.assignment.scala04._

class OrderTraitTest extends FunSuite {
  val personOne = new Person("test", 30)
  val personTwo = new Person("test", 30)
  val personThree=new Person("test",25)
  val personFour=new Person(name="testagain",35)
val lessthanfalse=personOne<personThree
  val lessthantrue=personOne>personThree
  val greaterthanfalse=personThree>personTwo
  val greaterthantrue=personTwo>personThree
  val lessthanorequalto=personOne<=personTwo
  val greaterthanorequalto=personOne>=personTwo
  val namenotsametrue=personFour>personOne
  val namenotsamefalse=personFour<personThree
  test("Less than  false test")
  {
    assert(lessthanfalse==false)
  }
  test("Less than true test")
  {
    assert(lessthantrue==true)
  }

  test("Greater than false test")
  {
    assert(greaterthanfalse==false)
  }
  test("Greater than true test")
  {
    assert(greaterthantrue==true)
  }
  test("less than or equal to")
  {
    assert(lessthanorequalto==true)
  }
  test("greater than or equal to")
  {
    assert(lessthanorequalto==true)
  }
  test("name is not same test true")
  {
    assert(namenotsametrue==true)
  }
  test("name is not same test false")
  {
    assert(namenotsamefalse==false)
  }
}
