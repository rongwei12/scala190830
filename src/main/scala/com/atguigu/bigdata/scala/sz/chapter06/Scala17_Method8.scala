package com.atguigu.bigdata.scala.sz.chapter06

object Scala17_Method8 {
  def main(args: Array[String]): Unit = {

    //Scala中一般的算法都采用递归实现
    def test( num : Long) : Long ={
      if( num <= 1) {
        1
      }else {
        num * test(num -1)
      }
    }

    println(test(10L))

    //尾递归,结果也参与递归
    //编译后，其实是死循环
    def test1(num:Int,r:Int): Int ={
      if( num <= 1){
        r
      }else{
        test1(num-1 ,num * r)
        //(5,1)
        /*
          (4,5*1)
          (3,4*5)
          (2,3*20)
          (1,2*60)
          (120)
         */
      }
    }
    println(test1(10,1))

  }
}
