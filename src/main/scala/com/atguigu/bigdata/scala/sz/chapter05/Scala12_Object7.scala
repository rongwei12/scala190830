package com.atguigu.bigdata.scala.sz.chapter05

object Scala12_Object7 {
    def main(args: Array[String]): Unit = {
        
        // TODO 面向对象 - 继承
        new User12()
        
    }
}
// 1111
// 2222
// 3333
// 4444
class Parent12() {
    println("1111")

    def this(name: String) {
        this()
        println("2222")
    }
}
//对象初始化需先对父类进行初始化
class User12(name:String) extends Parent12(name) {
    println("3333")
    def this( ) {
        this("xxxxx")
        println("4444")
    }
}