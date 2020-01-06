package com.atguigu.bigdata.scala.sz.chapter05

object Scala25_Object11_Enum {

    def main(args: Array[String]): Unit = {
        println(Color.RED)
        
    }
}
// 枚举类
object Color extends Enumeration {
    val RED = Value(1, "red")
    val YELLOW = Value(2, "yellow")
    val BLUE = Value(3, "blue")
}
object MyApp extends App {
    println("xxxx")
    println("xxxx")
    
}

