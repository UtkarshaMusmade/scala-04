package com

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