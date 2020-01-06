package com.atguigu.bigdata.scala.sz.chapter06

object Scala14_Method6_scan {
  def main(args: Array[String]): Unit = {
    //集合 - 常用方法
    val list = List(1, 2, 3, 4, 5)
    //z = zero   初始值
    //todo 扫描： 将fold方法中间的计算过程结果保留下来，形成集合
    println(list.scan(0)(_ + _))
    println(list.scanLeft("")(_ + _))
    println(list.scanRight("")(_ + _))
    println(list.scanLeft(0)(_ - _))

    println(list.scanRight(10)(_ - _))
    val listscan: List[Int] = list.scanRight(0)(_ + _)
    println(listscan.mkString(","))
  }
}
