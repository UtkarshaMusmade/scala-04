

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

class SquareQueue(list: List[Int]) extends Queue {

  def square(number: Int): Int = number * number
  val newlist = enqueue(list, square(3))
  println(dequeue(newlist))
}

class DoubleQueue(list: List[Int]) extends Queue {

  def double(number: Int): Int = number + number
  val newlist=enqueue(list, double(4))
  println(dequeue(newlist))
}

object QueueOperations extends App {
  val list = List(1, 2, 3)
  val squarequeue = new SquareQueue(list)
  val doublequeue = new DoubleQueue(list)





}