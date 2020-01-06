package com.atguigu.bigdata.scala.sz.chapter04

object Scala06 {
  def main(args: Array[String]): Unit = {

    // （1）传递代码块
    foo({
      println("aaa")
      10
    })
      // （2）函数参数只有一个，小括号可以省略
    foo{
      println("aaay")
      10
    }
  }
  def foo(a: =>Int):Unit = {
    println(a)
    println(a)
  }

}