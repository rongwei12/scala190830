package com.atguigu.bigdata.scala.sz.chapter06

import scala.collection.mutable

object Scala08_Map {
  def main(args: Array[String]): Unit = {
    //todo 集合 - Map (不可变)
    //Map集合中保存的是键值对（k-v）对象
    //Scala中键值对使用特殊符号声明：K -> V
    val map: Map[String, Int] = Map("a" -> 1, "b" -> 2)
    println(map.mkString(","))
    //todo 集合 - Map （可变）
    val muMap = mutable.Map("a" -> 1, "b" -> 2)
    muMap.put("d", 4)
    muMap("d") = 6
    //删除
    muMap.remove("d")
    println(muMap)
    muMap.foreach(println)
    println(muMap.mkString(" "))
  }
}
