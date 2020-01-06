package com.atguigu.bigdata.scala.sz.chapter04

object Scala02_Function2_Normal {
  def main(args: Array[String]): Unit = {
    //todo 函数式编程
    //1.函数无参数，无返回值
    /*def f1(): Unit = {
      println("f1 ..")
    }
    f1()

    //2.函数有参数，无返回值
    def f2(name: String): Unit = {
      println(s"name=$name")
    }
    f2("zhangshan")

    //3.函数有参数，有返回值
    def f3(i: Int): Int = {
      return i + 20
    }
    println(f3(40))

    //4.函数无参数，有返回值
    def f4(): Int = {
      return 100;
    }
    println(f4())

    //5.函数有多个参数，有返回值
    def f5(i : Int,j : Int): Int = {
      return i + j
    }
    println(f5(10,20))

    //6.函数返回值类型不确定
    //Scala可以简化函数的声明，采用 todo 至简原则：越简单越好
    def f6( b : Boolean) : String ={
      if ( b ){
        return null
      }else{
        return "zhangsan"
      }
    }
    println(f6(false))

    //7.可变参数:如果有多个参数，可变参数不能放置在后面，一般放置在最后
    def f7(j:Int,i :Int*): Unit ={
      println(i)
    }
    f7(10,20,30,40)*/

    //8.参数的默认值
    def f8( name : String = "匿名") : Unit = {
      println("name=" + name)
    }
    f8()

    def f88(name:String="zhansn"): Unit ={
      println("name=" + name)
    }
    f88("wangwu")
    //9.带名参数：传递参数时把名称带上
    def f9(name:String="zhansn",age:Int=13): Unit ={
      println("name=" + name)
    }
    //Scala中函数的参数的匹配规则是从左到右
    f9(age=30)
  }
}
