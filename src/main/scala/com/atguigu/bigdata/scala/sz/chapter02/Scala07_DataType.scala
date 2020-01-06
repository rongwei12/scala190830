package com.atguigu.bigdata.scala.sz.chapter02


object Scala07_DataType {
    def main(args: Array[String]): Unit = {
       //todo DataType
      //String name = null
      //Integer i = null
      //null  其实是Null类型的对象

      //null是引用类型，无法赋值给值类型
      /*val name = null
      val int : Int = null
      println(name)
      println(int)*/
//      val list : List[Nothing] = list()
      println(test1)

    }

    def test() : Nothing = {
      throw new Exception()
    }
    def test1(): Unit ={

    }
}
