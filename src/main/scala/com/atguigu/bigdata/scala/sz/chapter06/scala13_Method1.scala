package com.atguigu.bigdata.scala.sz.chapter06

object scala13_Method1 {
  def main(args: Array[String]): Unit = {
    //集合 - 常用方法
    val list = List(1, 2, 3, 4, 4)

    //功能
    //    println(list.sum)
    //    println(list.max)
    //    println(list.min)
    //    println(list.product)//乘积

    //功能 - 简单
    //todo 是否包含指定元素 contains()
    println(list.contains(2))
    //todo 反转 reverse
    println(list.reverse)
    //todo 取数据 take()
    println(list.take(2))
    //todo 从右边开始取数据 takeRight()
    println(list.takeRight(2))
    //todo 去重 distinct
    println(list.distinct)
    //todo 采集 collect
    //println(list.collect())
    //todo mapValues:保存key不变的情况，将value进行映射转换


    //        list.map()
    //        list.flatten
    //        list.flatMap()

    //        list.filter()
    //        list.groupBy()
    //        list.sortWith()
    //        list.sortBy()


    // 多元数据操作
    //        list.sliding()
    //        list.union()
    //        list.intersect()
    //        list.diff()
    //        list.zip()


    // 计算
    //        list.reduce()
    //        list.reduceLeft()
    //        list.reduceRight()
    //        list.fold()
    //        list.foldLeft()
    //        list.foldRight()
    //        list.scan()
    //        list.scanLeft()
    //        list.scanRight()

  }


}
