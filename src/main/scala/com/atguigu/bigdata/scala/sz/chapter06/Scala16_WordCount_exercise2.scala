package com.atguigu.bigdata.scala.sz.chapter06

object Scala16_WordCount_exercise2 {
  def main(args: Array[String]): Unit = {

    //todo WordCount第二种方法
    val tlist = List(
      ("Hello Hadoop Hive Kafka", 4),
      ("Hello Hadoop Hive", 3),
      ("Hello Hadoop", 2),
      ("Hello", 1)
    )
    //1、分离
    /*val tuplesToTuple: List[(String, Int)] = tlist.flatMap(s => {
      s._1.split(" ").map(word => (word, s._2))
    })*/
    val tuplesToTuple = tlist.flatMap(s => {
      s._1.split(" ").map(word => (word, s._2))
    })
    println(tuplesToTuple)
    //2、分组,聚合
   /* val stringToInts = tuplesToTuple.groupBy(s => s._1).map(list => {
      (list._1, list._2.map(s => s._2).sum)
    })
    println(stringToInts)
    //3、
    println(stringToInts.toList.sortBy(-_._2).take(3))*/


    println(tlist.flatMap(s => {
      //List((Hello,4), (Hadoop,4), (Hive,4), (Kafka,4), (Hello,3), (Hadoop,3), (Hive,3), (Hello,2), (Hadoop,2), (Hello,1))
      val words: Array[String] = s._1.split(" ")
      words.map((_, s._2))
    }).groupBy(s => s._1).map( //List((Hello,10), (Hadoop,9), (Hive,7))
      t => {
        val ints: List[Int] = t._2.map(_._2)
        (t._1, ints.sum)
      }).toList.sortBy(-_._2).take(3)
    )
    //todo mapValues
    println(tlist.flatMap(s => s._1.split(" ").map((_, s._2))).groupBy(_._1)
      .mapValues(s => s.map(_._2).sum)
      .toList.sortBy(-_._2).take(3))
  }
}
