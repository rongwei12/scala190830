package com.atguigu.bigdata.scala.sz.chapter06

object Scala14_Method3 {
  def main(args: Array[String]): Unit = {
    //todo 集合 - 常用方法
    val list1 = List(1, 2, 3, 4)
    val list2 = List(4, 5, 6, 7)
    val list3 = List(1, 2, 3, 4, 5, 6, 7, 8)

    //多元数据操作
    //交集，并集，差集

    //todo 并集
    println(list1.union(list2))
    //todo 交集
    println(list1.intersect(list2))
    //todo 差集
    //谁放前谁保留
    println(list2.diff(list1))
    //todo 拉链
    println(list1.zip(list2))
    println(list1.zip(list3))
    //todo 滑动 sliding:集合的一部分滑动
    val iterator: Iterator[List[Int]] = list3.sliding(3,1)
    while (iterator.hasNext) {
      println(iterator.next())
    }
  }
}
