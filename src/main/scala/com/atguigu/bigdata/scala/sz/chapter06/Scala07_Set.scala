package com.atguigu.bigdata.scala.sz.chapter06

import scala.collection.mutable

object Scala07_Set {
  def main(args: Array[String]): Unit = {
    //todo 集合 - Set(不可变)
    val set = Set(1,2,3,4,1,4,56,7,8,7)

    //无序，不可重复
    println(set)

    //todo 集合 - Set（可变）
    val muSet = mutable.Set(1,2,3,4)

    muSet.add(5)
    println(muSet)
    //update方法可以添加数据，也可以删除数据
    muSet.update(2, false)
    muSet.remove(5)
    println(muSet)
  }
}
