package com.atguigu.bigdata.scala.sz.chapter06

import scala.collection.immutable

object Scala02_Array {
  def main(args: Array[String]): Unit = {
    //todo 集合 - Array - 数组(不可变)
    //创建数组-1
    //val array = new Array(3);
    //val array: Array[String] = new Array[String](3)
    //创建数组-2
    val array: Array[String] = Array("1", "2", "3")
    //元素操作
    //访问数据元素，需要采用小括号来定位
    //修改数据
    array(0) = "a"
    array(1) = "c"
    array(2) = "b"

    //增加数据
    //数据可以添加数据，但是添加后会产生新的数据，所以Array是不可变的
    val array1: Array[String] = array :+ "d"
    //Scala中的运算使用冒号结尾，那么调用的顺序从右到左
    val array2: Array[String] = "e" +: array //array.+:(e)
    //集合打印
    /* println(array)
     for(s <- array){
       println(s)
     }*/
    /*def loop(s : String): Unit ={
     println(s)
   }
    array.foreach(loop)*/

    /*
     array.foreach(s=> println(s))
     array.foreach(println)*/

    println(array1.mkString(","))
    println(array2.mkString(","))
  }
}
