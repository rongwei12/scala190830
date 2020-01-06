package com.atguigu.bigdata.scala.sz.chapter04

import scala.util.control.Breaks._

object Scala08_Function8_lazy {
  def main(args: Array[String]): Unit = {
    //todo 函数式编程 - 延迟加载
    //用上才会调用sum,lazy不能修饰var
    lazy val res = sum(10, 30)
    println("----------------")
    println("res=" + res)
  }

  def sum(n1: Int, n2: Int): Int = {
    println("sum被执行。。。")
     n1 + n2
  }
}