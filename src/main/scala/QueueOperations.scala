import com.{DoubleQueue, Queue, SquareQueue}


class QueueOperations extends Queue {


  val squarequeue = new SquareQueue
  val doublequeue = new DoubleQueue


  def performOperations(list: List[Int], number: Int, f: (List[Int], Int) => List[Int]): List[Int] = {

    f(list, number)
  }



  def enqueueSquaredElement(list: List[Int], number: Int) = enqueue(list, squarequeue.square(number))

  def enqueueDoubledElement(list: List[Int], number: Int) = enqueue(list, doublequeue.double(number))

  def dequeueElement(list: List[Int]): List[Int] = dequeue(list)
}

object QueueOperations extends App {
  val q = new QueueOperations
  val list = List(1, 2, 3)
  println(q.performOperations(list, 3, q.enqueueSquaredElement))
  println(q.performOperations(list, 3, q.enqueueDoubledElement))

}