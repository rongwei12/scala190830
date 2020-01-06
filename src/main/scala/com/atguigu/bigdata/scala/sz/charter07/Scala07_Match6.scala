package com.atguigu.bigdata.scala.sz.charter07

import com.atguigu.bigdata.scala.sz.charter07.Scala06_Match5.User

object Scala07_Match6 {
    
    def main(args: Array[String]): Unit = {

        // TODO - 模式匹配 - 变量声明

        val (x, y) = (1, 2)
        println(s"x=$x,y=$y")

        val Array(first, second, _*) = Array(1, 7, 2, 9)
        println(s"first=$first,second=$second")

        val User(name, age) = User("zhangsan", 16)
        println(s"name=$name,age=$age")
    }
}
case class Person(name: String, age: Int)

