package com.atguigu.bigdata.scala.sz.chapter03

object Scala02_Logic_for {
  def main(args: Array[String]): Unit = {
    //todo 逻辑-循环-for
    //Range => 范围（集合）
    //最基本的for循环，类似于Java的增强for循环
    // 如果能够推断出数据的类型，则可以省略变量的类型
    for(i <- 100 to 103){//前后闭合
//      print(i + " ")
    }
    println()
    for(i <- 100 until 103){//前闭后开
//      print(i + " ")
    }
    println()
    for(i <- 100 to 103 by 2){//间隔2
      print(i + " ")
    }
    //方式二
    var list = new Range(1,5,2)
    for(j <- list){//1,3
      print(j + " ")
    }
    println()
    //循环守卫：类似continue
    for(i <- 2 to 6 if i != 2) {
      print(i + " ")
    }
    println()


    //嵌套循环
    /*for(i <- 1 to 3; j <- 1 to 3){
      println("i=" + i + " j=" + j)
    }*/

    //引入变量
    for(i <- 1 to 3; j = 4 - i){
      val j = 4 - i;
      println("i=" + i + "j = " + j)
    }

    //todo yield
    val result = for ( i <- list ) {//无作用
      i
    }
    val res = for (i <- 1 to 5 ) yield 2 * i
    println(res)


    //倒序打印10到1
    for(i <- 1 to 10 reverse){
        println(i)
    }
  }
}
