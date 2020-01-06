package com.atguigu.bigdata.scala.sz.chapter04

object Scala09_Test {
  def main(args: Array[String]): Unit = {
    println(f(1))
  }

  def f(day: Int): Int = {
    if (day == 10) {
      1
    } else {
      (f(day + 1) + 1)  * 2
    }
  }
}