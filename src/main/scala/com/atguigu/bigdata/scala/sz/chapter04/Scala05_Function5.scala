package com.atguigu.bigdata.scala.sz.chapter04

object Scala05_Function5 {
  def main(args: Array[String]): Unit = {
    //todo 函数式编程 - 练习
    val s = "zhangsan"
    def f1(f:String):String ={
      f.substring(0,1).toUpperCase
    }
   /* def f3(f:String):String ={
      f.substring(0,1).toLowerCase
    }*/

    def f(f2:(String)=>String): Unit ={
      println(f2(s))
    }
    f(f1)
    f((s:String)=>s.substring(0,1).toUpperCase)
    f(_.substring(0,1).toUpperCase)

  }
}