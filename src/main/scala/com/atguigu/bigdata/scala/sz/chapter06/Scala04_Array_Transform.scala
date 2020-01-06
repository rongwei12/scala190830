package com.atguigu.bigdata.scala.sz.chapter06

import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable

object Scala04_Array_Transform {
  def main(args: Array[String]): Unit = {

    //todo 集合 - Array - 数组 转换
    val array = Array(1,2,3)
    val buffer = ArrayBuffer(1,2,3)
    //不可变 => 可变
    val buffer1: mutable.Buffer[Int] = array.toBuffer
    //可变 => 不可变
    val array1 = buffer.toArray
    buffer1.append(1)
    println(buffer1)
    println(buffer)
    println(array)
    println(array1)

    //多维数组
    //（1）创建了一个二维数组, 有三个元素，每个元素是，含有4个元素一维数组()
    val arr = Array.ofDim[Int](3, 4)
    arr(1)(2) = 88
    arr(2)(3) = 11

    //（2）遍历二维数组
    for (i <- arr) { //i 就是一维数组
      for (j <- i) {
        print(j + " ")
      }
      println()
    }
  }
}
