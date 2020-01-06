package com.atguigu.bigdata.scala.sz.chapter06

object Scala15_WordCount_Test {
  def main(args: Array[String]): Unit = {
    val list = List("Hello World", "Hello World", "Hello Scala", "Hello Scala Hadoop")
    /*println(list.flatMap(s => s.split(" ")).groupBy(_ + "").map(
      kv => {
        (kv._1, kv._2.size)
      }
    ).toList.sortBy(s => -s._2).take(3))*/
    println(list.map(_.split(" ")).flatten.groupBy(_ +"").map(
      kv => (kv._1,kv._2.length)).toList.sortBy(-_._2).take(3)
    )

    val tuplesList = List(("Hello Scala World", 4), ("Hello World", 3), ("Hello Hadoop", 2), ("Hello Hbase", 1))

    println(tuplesList.map(v => ((v._1+" ") * v._2)).flatMap(_.split(" ")).groupBy(_+"").map(
      kv => (kv._1,kv._2.size)).toList.sortBy(-_._2).take(3))
  }

}
