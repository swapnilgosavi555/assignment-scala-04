import org.scalatest.FunSuite
import com.knoldus.assignment.scala04._

class QueueTest extends FunSuite {
  val doublequeueobj = new DoubleQueue()
  val squarequeueobj = new SquareQueue()
  val list = List.empty
  val doubleenqueulist = List(4)
  val squareenqueuelist = List(4, 64)
  val dequeuelist = List(64)

  test("Double Enqueue test") {
    assert(doublequeueobj.enqueue(list, 2) == doubleenqueulist)
  }
  test("Square Enqueue test") {
    assert(squarequeueobj.enqueue(doubleenqueulist, 8) == squareenqueuelist)
  }
  test("Dequeue test") {
    assert(doublequeueobj.dequeue(squareenqueuelist) == dequeuelist)
  }
}
