
import Person.{personOne, personTwo}
import  DisplayDetails.{displayDetails}
import org.scalatest.WordSpec

class TestCases extends WordSpec {

  val personOne = new Person("Utkarsha", 21)
  val personTwo = new Person("Utkarsha", 22)

  val firstname = new FirstName("Utkarsha")
  val lastname = new LastName("Musmade")
  val age = new Age(21)

  val list = List(1, 2, 3)
  val squarequeue = new SquareQueue(list)
  val doublequeue = new DoubleQueue(list)


  // val displaydetails = new DisplayDetails
 // val queueoperations = new QueueOperations
"Comparison" should {
  "compare person1 and person2" in {
    assert(personOne.compare(personTwo) == 1)
  }

}

  "Details" should {
    "Display Details" in {
      assert( displayDetails(firstname, lastname, age) == "Utkarsha Musmade is of 21 years")
    }

  }

 /* "List" should {
    "enqueue element after squaring" in {
      assert( squarequeue.square(3) == (2,3,9))
    }
    "enqueue element after doubling" in {
      assert(doublequeue.double(3) == (2,3,6))
    }

  }*/





}
