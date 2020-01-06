package com.atguigu.bigdata.scala.sz.chapter04

object Scala01_Function1 {
  def main(args: Array[String]): Unit = {
    //todo 函数式编程
    //Scala多范式
    //Scala是一个完全面向函数编程的语言
    //函数：

    //声明函数
    //def 函数名（参数列表）：函数返回值类型 = {函数体}

    /*函数 & 方法
        类中的函数就是方法
        Scala中的语法非常灵活，可以在任意的语法结构嵌套语法结构
        函数（方法）中可以声明函数
     */
    def test(): Unit = {
      println("xxxx")
    }
    //调用函数：函数名（函数）
    test();

  }
}
