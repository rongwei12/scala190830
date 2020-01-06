package com.atguigu.bigdata.scala.sz.charter07

object Scala08_Match7 {
  def main(args: Array[String]): Unit = {
    //todo - 模式匹配 - 偏函数

    //偏函数：函数只对满足条件的数据进行操作，并不会对所有的函数进行操作
    //将该List(1,2,3,4,5,6,"test")中的Int类型的元素加一，并去掉字符串
   val list = List(1, 2, 3, 4, 5, 6, "test")
    /* val list1 = list.filter(_.isInstanceOf[Int])
    val numList= list1.map(s => (s.asInstanceOf[Int]+1))
    println(numList)

    val list2: List[Any] = list.map(
      date => {
        date match {
          case num: Int => num + 1
          case d => d
        }
      }
    )
    val list3 = list2.filter(date => date.isInstanceOf[Int])
    println(list3)*/

    //todo 采集
    //collect方法可以对部分数据进行采集 -----PartialFunction有这个才能用
    val list1: List[Int] = list.collect {
      case num: Int => num + 1
    }
    //map方法只能对全量数据进行操作，不支持偏函数
    val list2: List[Int] = list.map {
      case num: Int => num + 1
    }
    println(list1)
    //println(list2) //error

  }
}
