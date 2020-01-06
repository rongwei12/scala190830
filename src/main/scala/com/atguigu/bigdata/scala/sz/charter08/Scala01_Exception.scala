package com.atguigu.bigdata.scala.sz.charter08

import java.io.FileInputStream

object Scala01_Exception {
  def main(args: Array[String]): Unit = {
    //todo 异常
    //Scala中异常采用的也是模式匹配,但是省略match关键字
    //Scala中异常没有分类，所有不需要在编译时提示
    //而且也不需要显示的用try，catch进行捕捉
    //一般将范围小的异常放置在前面捕捉，范围大的异常放置在后面捕捉
    //scala中没有throws关键字
    //val in = new FileInputStream("xxxx")

    var i = 0
    try{
      val s = 10 / i
    }catch{
      case e:ArithmeticException => println("除数为0")
      case ex:Exception => println("其他异常")
    }
  }
}