package com.atguigu.bigdata.scala.sz.chapter06

import scala.collection.mutable

object Scala18_Method9_queue {
  def main(args: Array[String]): Unit = {

    val que = new mutable.Queue[String]()

    que.enqueue("1","a", "b", "c")

    println(que.dequeue())
    println(que.dequeue())
    println(que.dequeue())
    println(que.dequeue())
  }
}
