
import Person.{personOne, personTwo}
import DisplayDetails.displayDetails
import com.{DoubleQueue, SquareQueue}
import org.scalatest.WordSpec

class TestCases extends WordSpec {

  val personOne = new Person("Utkarsha", 21)
  val personTwo = new Person("Utkarsha", 22)

  val firstname = new FirstName("Utkarsha")
  val lastname = new LastName("Musmade")
  val age = new Age(21)

  val list = List(1, 2, 3)

  val squarequeue = new SquareQueue()
  val doublequeue = new DoubleQueue


  // val displaydetails = new DisplayDetails
  val queueoperations = new QueueOperations
  "Comparison" should {
    "compare person1 and person2" in {
      assert(personOne.compare(personTwo) == 1)
    }

  }

  "Details" should {
    "Display Details" in {
      assert(displayDetails(firstname, lastname, age) == "Utkarsha Musmade is of 21 years")
    }

  }

  val newlist: List[Int] = queueoperations.performOperations(list, 3, queueoperations.enqueueSquaredElement)
  val newlist1: List[Int] = queueoperations.performOperations(newlist, 3, queueoperations.enqueueDoubledElement)
  "List" should {
    "enqueue element after squaring" in {
      assert(newlist == List(1, 2, 3, 9))
    }
    "enqueue element after doubling" in {
      assert(newlist1 == List(1, 2, 3, 9, 6))
    }
    "dequeue element " in {
      assert(queueoperations.dequeueElement(newlist1) == List(2, 3, 9, 6))
    }

  }
}
