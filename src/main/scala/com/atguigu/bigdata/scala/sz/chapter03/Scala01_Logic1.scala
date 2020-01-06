package com.atguigu.bigdata.scala.sz.chapter03

object Scala01_Logic1 {
  def main(args: Array[String]): Unit = {
    // todo 逻辑-控制
    val flg = true
    //scala中很多的表达式其实也是方法，也会有返回值
    if (flg) {
      println("flg = true")
    } else {
      println("flg=false")
    }

    if (flg) {

    } else {

    }
    //if(){}.else{}
    //if表达式的值等同于满足条件的最后一行代码的结果
    val i = if (flg) {
      20//是个对象
      100
      "zhangsan"
//      println("xxxx")
    }else {
      null
    }
    //类似三元运算符
    var j = if(flg) 20 else 30
    println(j)
  }
}
/*todo switch穿透(scala没有），scala中用模式匹配代替
switch(){
  case 10:
    xxxxx
  case 20:
    xxxxx
}
*/
