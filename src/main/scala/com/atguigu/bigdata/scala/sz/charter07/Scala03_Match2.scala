package com.atguigu.bigdata.scala.sz.charter07

object Scala03_Match2 {
  def main(args: Array[String]): Unit = {
    //todo - 模式匹配  - 1匹配常量
    println(describe(5))
    def describe(x: Any) = x match {

      case 5 => "Int five"
      case "hello" => "String hello"
      case true => "Boolean true"
      case '+' => "Char +"
      case _ => "xxxx"
    }

    //todo - 模式匹配  - 2匹配类型
    println(describeType("nihao"))
    println(describeType("nihao", 1, 2, 3))
    def describeType(x: Any) = x match {

      case i: Int => "Int"
      case s: String => "String hello"
    //模式匹配在进行类型匹配时，不考虑泛型
      case m: List[_] => "List"
    //Array由于编译后没有泛型的概念，所以匹配时需要考虑泛型
      case c: Array[Int] => "Array[Int]"
      case someThing => "something else " + someThing
    }

    //todo - 模式匹配 - 3匹配数组
    for (arr <-
      Array(Array(0),
      Array(1, 0),
      Array(0, 1, 0),
      Array(1, 1, 0),
      Array(1, 1, 0, 1),
      Array("hello", 90))) { // 对一个数组集合进行遍历

      val result = arr match {
        case Array(0) => "0" //匹配Array(0) 这个数组
        case Array(x, y) => x + "," + y //匹配有两个元素的数组，然后将将元素值赋给对应的x,y
        case Array(0, _*) => "以0开头的数组" //匹配以0开头和数组
        case _ => "something else"
      }

      println("result = " + result)

    }
    //todo - 模式匹配 - 4匹配列表
    //list是一个存放List集合的数组
    //请思考，如果要匹配 List(88) 这样的只含有一个元素的列表,并原值返回.应该怎么写
    for (list <- Array(
      List(0),
      List(1, 0),
      List(0, 0, 0),
      List(1, 0, 0),
      List(88))) {

      val result = list match {

        case List(0) => "0" //匹配List(0)
        case List(x) => x
        case List(x, y) => x + "," + y //匹配有两个元素的List
        case List(0, _*) => "0 ..."
        case _ => "something else"
      }

      println(result)
    }
    //todo - 模式匹配 - 4匹配列表1
    val list: List[Int] = List(1, 2, 5, 6, 7)

    list match {
      case first :: second :: third :: rest1 => println(first + "-" + second + "-" + third + "-" + rest1)
      case _ => println("something else")
    }
    //todo - 模式匹配 - 5匹配元组
    //对一个元组集合进行遍历
    for (tuple <- Array(
      (0, 1),
      (1, 0),
      (1, 1),
      (1, 0, 2)
    )) {

      val result = tuple match {
        case (0, _) => "0 ..." //是第一个元素是0的元组
        case (y, 0) => "" + y + "0" // 匹配后一个元素是0的对偶元组
        case (a, b) => "" + a + " " + b
        case _ => "something else" //默认

      }
      println(result)
    }

  }
}
