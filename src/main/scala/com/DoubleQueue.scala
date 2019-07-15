package com


  class DoubleQueue(list: List[Int]) extends Queue {

    def double(number: Int): Int = number + number
    val newlist=enqueue(list, double(4))
    println(dequeue(newlist))
  }

