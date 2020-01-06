package com.atguigu.bigdata.scala.sz.chapter06

object Scala12_Method {
  def main(args: Array[String]): Unit = {

    //todo 集合 - 常用方法
    val list = List(1, 2, 3, 4)

    //length = size
    println(list.length)
    println(list.size)

    //组成部分
    println(list.head)
    println(list.tail.tail) //List(2, 3, 4)
    println(list.last)
    println(list.init) //List(1, 2, 3)

    //循环
    //list.iterator
    //list.productIterator
    list.foreach(println)
    println(list.mkString(","))
  }
}
