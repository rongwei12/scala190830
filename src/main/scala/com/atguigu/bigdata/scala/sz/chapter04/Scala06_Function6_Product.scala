package com.atguigu.bigdata.scala.sz.chapter04

object Scala06_Function6_Product {
  def main(args: Array[String]): Unit = {
    //todo 函数式编程 - 递归
    //递归在函数式编程语言中最常见的算法
    /*Scala递归的参数
      1.函数调用自身
      2.函数应该有跳出递归的逻辑
      3.递归调用时的参数应该有规律
      4.递归函数不能省略返回值类型
    */
    //阶乘5！
    println(test(5))

  }
  def test(num:Int):Int ={
    if(num == 1){//终止条件：return 1
      1
    }else{
      num * test(num - 1)
    }
  }
}
