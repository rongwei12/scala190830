package com.atguigu.bigdata.scala.sz.chapter04

object Scala03_Function3_Nightmare {
  def main(args: Array[String]): Unit = {
    //todo 函数式编程 - 噩梦版
    //至简原则：能省则省
    def f1():String = {
      "zhangsan"
//      return "zhangsan"
    }

    //todo 1.如果能推断出函数的返回值类型，那么返回值类型可以省略
    //一般函数中不需要使用return语法，函数可以根据满足条件的最后一行代码作为返回值
    def f2(): Any = {
      val flg = true
      if(flg){
        12
      }else{
        "zhnagsan"
      }
    }

    //todo 2.如果函数体只有一行代码，那么花括号可以省略
    def f3() = "zhanasan"

    //todo 3.如果函数中参数列表中无参，那么参数列表可以省略
    //如果省略小括号，那么调用时也不能加小括号,为了统一访问原则：类似于变量访问
    def f4 = "zhansan"
//    println(f4)

    // 如果函数返回值使用Unit，函数不会采用最后一行代码作为返回值
    // todo 4.如果想要省略Unit，但是又不想使用最后一行代码作为返回值，那么等号可以省略
    def f5()={
      "张三"
    }
    println(f5)

    //todo 5.如果不关心函数名称，只关心函数的实现，那么可以省略函数名，使用匿名函数
    //匿名函数可以赋值给变量，通过变量来调用
    val f6 = () => {println("xxx")}
  }
}