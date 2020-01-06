package com.atguigu.bigdata.scala.sz.chapter02

object Scala05_String {
    def main(args: Array[String]): Unit = {
        //todo String

        val name : String = "zhangsan"
        val age : Int = 20

        //JSON => javaScript Object Notation:对象
        //array = [{},{}]

        //json字符串 => { "username":"zhangsan","age":20 }
        //js中可以那么写{ 'username':'zhangsan','age':20 }

        println("{ \"username\":\"zhangsan\",\"age\":20 }")

        //插值字符串
        println(s"username = $name,age = $age")
        //EL表达式
        println(s"username = ${name.toUpperCase()},age = $age")

        //换行
        //println(s"username = ${name.toUpperCase()} \n" + s"age = $age")

        //多行字符串："""回车""""，多用于SQL
        println(
            s"""
              |username = $name
              |age = $age
              |""".stripMargin)

        printf("name=%s age=%d\n",name,age)
    }
}
