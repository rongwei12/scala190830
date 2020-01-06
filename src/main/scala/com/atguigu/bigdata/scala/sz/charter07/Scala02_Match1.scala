package com.atguigu.bigdata.scala.sz.charter07

object Scala02_Match1 {
  def main(args: Array[String]): Unit = {
    //todo - 模式匹配  - 守卫

    //Scala中的模式匹配可以匹配数据的类型
    def abs(x: Int) ={
      x match {
        //表达匹配某个范围的数据，就需要在模式匹配中增加条件守卫
        case i: Int if i >= 0 => i
        case j: Int if j < 0 => -j
        case _ => "type illegal"
      }
    }
    println(abs(-5))
  }
}
