package com.atguigu.bigdata.scala.sz.chapter04

object Scala04_Function4_Hell {
  def main(args: Array[String]): Unit = {
    //todo 函数式编程 - 地狱版
    //Scala语言是完全面向函数的，所有万物皆函数
    //函数什么可以做：todo 可以作为变量，可以作为参数，还可以作为返回值
    //Scala中函数的参数最多只能有22个
    def f1():Unit = {
      println("f1....")
    }
    //如果函数没有参数，那么在调用时，可以不使用小括号
    //如果想要把函数作为一个整体传递给变量，那么可以使用下划线
    //变量就可以作为一个函数来使用
    //todo 1.函数作为变量
//    val f = f1 _
//    f1()
//    f()

    //todo 2.函数作为参数来使用
    //函数的参数也可以是函数：函数(函数名：函数类型)
    //函数类型：（参数列表）=>返回值类型
    def f2(f: (Int,Int)=>Int): Int ={
      f(10,40)
    }
//    def f22(i:Int,j:Int): Int ={
//      i+j
//    }
//   println( f2(f22))
//   println (f2((x:Int,y:Int) =>{x+y}))

    //如果匿名函数中参数的类型可以推断，那么也可以省略
    //f2(x:Int,y:Int) =>{x+y})
    //如果函数逻辑只有一行代码，那么函数体的花括号可以省略
    //f2((x,y) =>{x,y})
    //如果参数只使用了一次，而且有顺序，那么可以省略参数，使用下划线代替指定位置的参数
//    f2((x,y) =>x+y)
      f2(_+_)
      println(f2(_*_))

    //todo 3.函数作为返回值来使用
    def f(): Unit ={
      println("f...")
    }

   /* def f1() ={
      f
    }*/

  }
}