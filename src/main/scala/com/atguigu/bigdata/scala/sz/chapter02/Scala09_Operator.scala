package com.atguigu.bigdata.scala.sz.chapter02

object Scala09_Operator {
    def main(args: Array[String]): Unit = {
        //todo 运算符
        val s = new String("abc")
        val s1 = new String("abc")
        //==是equals(只限字符串）
        println(s == s1)
        //eq是==（只限字符串）
        println(s eq s1)

        val obj = new Object()
        val obj1 = new Object()
        println(obj == obj1)
    }
}
