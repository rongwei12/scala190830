package com.atguigu.bigdata.scala.sz.chapter04

import scala.util.control.Breaks._

object Scala07_Function7_Abstract {
  def main(args: Array[String]): Unit = {

    //  TODO 函数式编程 - 控制抽象

    // 将代码作为参数传递给函数
    def f = () => {
      println("f...")
      10
    }

    breakable {
      for (i <- 1 to 5) {
        if (i == 3) {
          break
        } else {
          println(i)
        }
      }
    }

//     函数柯里化
      def curry(i:Int)(j:Int)(f:(Int, Int)=>Int): Int = {
          f(i, j)
      }

      println(curry(10)(20)(_ + _))
      def test(i:Int) = {
          def f1(j:Int): Unit = {
              println("xxx")
          }
          f1 _
      }

      test(10)(20)

    def whilex(f: => Boolean)(op: => Unit): Unit = {
      if (f) {
        op
        whilex(f)(op)
      } else {

      }
    }

    whilex(1 > 0) {
      println("xxxx")
    }
  }
}