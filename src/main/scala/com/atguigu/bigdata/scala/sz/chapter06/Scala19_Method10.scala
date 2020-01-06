package com.atguigu.bigdata.scala.sz.chapter06

object Scala19_Method10 {
  def main(args: Array[String]): Unit = {
    //A => B
    //0 => name
    //1 => name
    //...
    // 100 => name
    val result1 = (0 to 100).map{
      case _ => Thread.currentThread.getName
    }
    //par 并行
    val result2 = (0 to 100).par.map{
      case _ => Thread.currentThread.getName
    }

    println(result1)
    println(result2)
  }
}
