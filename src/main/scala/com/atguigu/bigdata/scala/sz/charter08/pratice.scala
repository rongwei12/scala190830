package com.atguigu.bigdata.scala.sz.charter08

object pratice {

  def main(args: Array[String]): Unit = {
    //一个方法一个栈帧，先进后出
    def pre(i:Int) {
        if(i > 2){
          pre(i-1)
        }else{

      println(i)
        }
    }
   pre(4)//2,3,4
  }
}