package com.atguigu.bigdata.scala.sz.chapter02

object Scala04_Name {
  def main(args: Array[String]): Unit = {
      val name : String = "zhangsan"
      val ** : String = "sss"
      val -*!@#%^++ : String = "sss"
      //1 + 1
      1.+(1)
      var `private` : String = "private"

      //Scala中给下划线提供了更多语法的支持，所以在当前场合下，无法确定下划线的作用
      val _ : String = "zhangsan"
      //Todo 报错，_有更多的含义
//      println(_)

      //Todo Int不是关键字，只是类名
      val Int : Int = 10
  }
}
