package edu.knoldus

import scala.annotation.tailrec

class TailRecursion {
  @tailrec
  final def lengthlist(list: List[Int], accumulator: Int): Int = {
    if (list == Nil) accumulator
    else if (!list.isEmpty) lengthlist(list.tail, 1 + accumulator)
    else
      -1
  }
}

object main extends App{
  val tailRecursion = new TailRecursion
  val nums: List[Int] = List(1,2,3,4,5,6,7,8)
  println(tailRecursion.lengthlist(nums,0))
}