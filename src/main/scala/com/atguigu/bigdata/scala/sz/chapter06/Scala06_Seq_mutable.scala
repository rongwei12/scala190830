package com.atguigu.bigdata.scala.sz.chapter06

import scala.collection.mutable.ListBuffer

object Scala06_Seq_mutable {
  def main(args: Array[String]): Unit = {
    //todo 集合 - Seq - list(可变)
    val buffer = ListBuffer(1,2,3,4)

    buffer.append(5)
    buffer.insert(0,6)
    buffer.update(0,7)
    buffer(0) = 7

    buffer.remove(0)
    buffer.remove(0,2)



  }

}
