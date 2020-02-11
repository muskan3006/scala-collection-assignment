package com.knoldus

class ListOps {
  def lastElem(list: List[Int]): String ={
  @scala.annotation.tailrec
  def lastElement(list: List[Int], count: Int): String = list match {
    case Nil => "No element"
    case first :: Nil => s"Last Element:$first and Index:$count"
    case first :: rest => lastElement(rest, count + 1)
  }
    lastElement(list,0)
  }

  def sumOfList(list: List[Int]) {
    @scala.annotation.tailrec
    def sumList(list: List[Int], sum: Int): Any = list match {
      case first :: rest => sumList(rest, sum + first)
      case Nil => sum
    }

    sumList(list, 0)
  }

  def productOfList(list: List[Int]): Any = {
    @scala.annotation.tailrec
    def productList(list: List[Int], prod: Int): Any = list match {
      case first :: rest => productList(rest, prod + first)
      case Nil => prod
    }

    productList(list, 1)
  }

}

object Operation extends App {
  val lists = new ListOps
  val list = List(1, 2, 3, 4, 5)
  println(lists.lastElem(list))
  println(lists.productOfList(list))
  println(lists.productOfList(list))
}
