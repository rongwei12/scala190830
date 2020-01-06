package com.atguigu.bigdata.scala.sz.chapter02

import scala.io.StdIn

object Scala08_DataType1 {
    def main(args: Array[String]): Unit = {
      val age = StdIn.readInt();
      if(age < 18){
        println("童年")
      }else if( 18 <= age && age < 30 ){
        println("中年")
      }else{
        println("老年")
      }
    }
}
