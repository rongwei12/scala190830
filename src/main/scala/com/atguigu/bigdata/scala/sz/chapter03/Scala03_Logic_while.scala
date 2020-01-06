package com.atguigu.bigdata.scala.sz.chapter03

import scala.util.control.Breaks

object Scala03_Logic_while {
  def main(args: Array[String]): Unit = {
    //todo 逻辑-循环-while

  /*  var flg = true
    while (flg) {
      println("xxx")
      flg = false
    }

    do{
      println("yyyyy")
      flg = false
    }while(flg)*/

    /*  *九重妖塔
      * * *
     * * * * *
    */
    for(i <- new Range(1,18,2); j = (18-i)/2){
      println(" "*j + "*"*i)
    }

    //break
    Breaks.breakable{
      for(i <- 1 to 5){
        if(i == 3){
//          break
        }else{
          println("xxxx")
        }
      }
    }

  }
}
