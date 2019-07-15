import org.scalatest.FunSuite
import com.knoldus.assignment.scala04._

class HigerOrderFunctionTest extends FunSuite {
  val higherorderobj = new HigherOrderFunction()
  val doublequeueobj = new DoubleQueue()
  val squarequeueobj = new SquareQueue()
  test("Sum of square") {
    assert(higherorderobj.getSum(higherorderobj.getSumOfSquare, 2, 3) == 13)
  }
  test("Sum of cube") {
    assert(higherorderobj.getSum(higherorderobj.getSumOfCubes, -1, 3) == 26)
  }
  test("Sum of ints") {
    assert(higherorderobj.getSum(higherorderobj.getSumOfInts, -10, 7) == (-3))
  }
}
