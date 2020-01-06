package com.atguigu.bigdata.scala.sz.chapter06

object Scala14_Method5_fold {
  def main(args: Array[String]): Unit = {
    //集合 - 常用方法 - fold
    val list = List(1, 2, 3, 4, 5)
    //z = zero   初始值
    //todo 折叠： 将集合中的数据和集合外的数据进行聚合，结果类型为集合外的数据类型
    //集合外的数据称之为初始值，作为fold方法的第一个参数列表的参数出现
    println(list.fold(0)(_ + _))
    println(list.foldLeft("")(_ + _))
    println(list.foldRight("")(_ + _))
    println(list.foldLeft(0)(_ - _))
    /*
      1 2 3 4 5
      0 5 4 3 2 1
      (1 - (2 - (3 - (4 - (5 - 0)))))
     */
    println(list.foldRight(10)(_ - _))
  }
}
