import com.DoubleQueue
import com.SquareQueue

trait Queue {
  def enqueue(list: List[Int], number: Int): List[Int] = {
    val newlist: List[Int] = list :+ number;
    newlist
  }

  def dequeue(list: List[Int]): List[Int] = {
    val newlist: List[Int] = list.tail
    newlist
  }
}



object QueueOperations extends App {
  val list = List(1, 2, 3)
  val squarequeue = new SquareQueue(list)
  val doublequeue = new DoubleQueue(list)





}