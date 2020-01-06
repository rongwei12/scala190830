package com.atguigu.bigdata.scala.sz.chapter06

import scala.collection.mutable.ArrayBuffer

object Scala03_Array_mutable {
  def main(args: Array[String]): Unit = {
    //todo 集合 - Array - 数组(可变)
    //可变集合的普通操作方法一般都不会产生新的集合，但是运算符号的方法一般都会产生新的
    val buffer = ArrayBuffer[String]();
    //增加
    /*buffer.append("a", "b", "c")
    buffer.insert(0, "d", "e")*/
    val buffer2: ArrayBuffer[String] = buffer.+:("e")
    val buffer3 = buffer += "e"//+=不会产生新的数组

    //修改,以下两行在编译后都一样
    /*buffer(0) = "f"//和update是一样的，在编译时会自动转换
    buffer.update(1,"g")*/

    //删除
    /*buffer.remove(0)
    buffer.remove(1,2)
    val buffer1: ArrayBuffer[String] = buffer.-("c")*/
    //产生一个新的集合
    /*val buffer1: ArrayBuffer[String] = buffer.drop(1)
    val buffer2: ArrayBuffer[String] = buffer.dropRight(1)*/

    println(buffer)
    //    println(buffer1)
    println(buffer==buffer3)
  }
}
