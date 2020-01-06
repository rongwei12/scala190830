package com.atguigu.bigdata.scala.sz.charter07

object Scala01_Match {
  def main(args: Array[String]): Unit = {
    //todo - 模式匹配 - 强大
    //Scala中模式匹配为了代替java中的switch语法
    //而且scala提供了更多的功能

    var a: Int = 10
    var b: Int = 20
    var operator: Char = '+'

    //跳出判断逻辑不需要使用break

    //Scala中的模式匹配如果没有任何一个条件满足，那么会发生错误MatchError
    var result = operator match {
      //Scala中的模式匹配规则是按照case的顺序依次执行，主要满足就会执行相应的逻辑
      //case _ => "illegal"
      case '+' => {
        a + b
      }
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case _ => "illegal"
    }
    println(result)
  }
}
