package com.atguigu.bigdata.scala.sz.chapter06

import scala.collection.mutable

object Scala09_Map1 {
  def main(args: Array[String]): Unit = {

    //todo Map - Option
    val wordToCount: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)

    //获取指定key的值（value）
    //java取一个不存在的key，返回为null
    //scala取一个不存在的key，返回为None,无法获取value，会发生错误
    //scala取一个不存在的key，返回为Some，可以调用get方法获取value
    //Scala中从Map中获取数据的结果类型为Option（选项），只有两个值：一个是Some，一个是None
    val value = wordToCount.get("d")
    val value1 = wordToCount.get("b")

    println(value)
    println(value1)
    println(value.getOrElse(0))
    println(value1.getOrElse(0))

    println(wordToCount.getOrElse("d", 0))
    //Scala中Option类型专门是为了解决空指针异常的

    val keys = wordToCount.keys
    val values = wordToCount.values
    val iterator = wordToCount.iterator
    val iterator1 = wordToCount.keysIterator

    println(keys)
    println(values.max)
    println(iterator.toArray.mkString(","))
    println(iterator1.mkString(","))
  }
}
