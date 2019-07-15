package com{

  class SquareQueue(list:List[Int]) extends Queue {

    def square(number:Int):Int=number*number
    val newlist=enqueue(list,square(3))
    println(dequeue(newlist))
  }
}