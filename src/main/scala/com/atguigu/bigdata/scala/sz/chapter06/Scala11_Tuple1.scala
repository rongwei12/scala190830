package com.atguigu.bigdata.scala.sz.chapter06

import scala.collection.mutable

object Scala11_Tuple1 {
  def main(args: Array[String]): Unit = {
    //如果元组中元素的数量只有2个，那么将这样的元组称之为 对偶 元组
    //也称之为 键值对
    val tuple = ("a", 1)
    val tuple1 = "b" -> 2

    val map = mutable.Map(("a", 1), ("b", 2))
    for (kv <- map) {
      print(("k= " + kv._1))
      println(("  v= " + kv._2))
    }

  }
}
