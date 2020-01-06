package com.atguigu.bigdata.scala.sz.chapter06

object Scala05_Seq {
  def main(args: Array[String]): Unit = {

    // todo 集合 - Seq - List (不可变)
    // 创建集合
    //val list: List[Nothing] = new List() // error
    val list: List[Int] = List(1,2,3,4)

    // 增加数据
    //val list1: List[Int] = 5 +: list
    //val ints1: List[Int] = 1::2::3::4::5::list
    // List() ==> Nil
    val list1 = 1::2::3::Nil

    val list2 = 4::list1::Nil
    // 4, 1, 2, 3
    // 三个冒号表示将一个整体拆分成一个一个的个体来使用, 将这个操作称之为扁平化操作
    val list3 = 5 :: list1 ::: Nil

    val list4: List[Int] = list.++(list1)
    val list5: List[Int] = list.+:(1)

    // 修改
    //list(0) = 5 // list.update(0, 5) error
    val ints: List[Int] = list.updated(0, 5)

    println(list4)
    //println(list1)
  }
}
