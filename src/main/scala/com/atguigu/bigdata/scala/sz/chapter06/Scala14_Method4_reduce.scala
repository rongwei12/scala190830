package com.atguigu.bigdata.scala.sz.chapter06

object Scala14_Method4_reduce {
  def main(args: Array[String]): Unit = {
    //todo 集合 - 常用方法 -reduce
    val list = List(1, 2, 3, 4, 5)
    //reduce: (Int,Int) => Int
    //(Int,Int) => String(1234):reduce做不到，fold可以

    //按照指定的规则进行计算
    //todo 简化，规约，聚合
    //采用自定义的计算规则对集合的数据进行聚合操作
    //reduce方法要求返回值和参数类型保持一致
    println(list.reduce(
      (x, y) => x - y
    ))
    list.reduce(_ - _)
    //((((1 - 2) - 3) - 4) -5)
    println(list.reduceLeft(_ - _))
    //(1 - (2 - (3 - (4 -5))))
    println(list.reduceRight(_ - _))
  }

}
