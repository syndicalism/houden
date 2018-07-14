import io.trosa.houden.Add
import collection.mutable.Stack
import org.scalatest.{FlatSpec, Matchers}

class AddTest extends FlatSpec with Matchers {

  "A Stack" should "pop values in last-in-first-out order" in {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    stack.pop() should be (2)
    stack.pop() should be (1)
  }

  it should "throw NoSuchElementException if an empty stack is popped" in {
    val emptyStack = new Stack[Int]
    a [NoSuchElementException] should be thrownBy {
      emptyStack.pop()
    }
  }

  "An addition function" should "compute addition correctly" in {
    Add.exec(3, 3) should be (6)
  }
}
