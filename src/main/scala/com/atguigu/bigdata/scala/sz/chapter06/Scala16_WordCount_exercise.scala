package com.atguigu.bigdata.scala.sz.chapter06

object Scala16_WordCount_exercise {
  def main(args: Array[String]): Unit = {

    //todo 练习题第一种方法
    val tuples: List[(String, Int)] = List(
      ("Hello Hadoop Hive Kafka    ", 4),
      ("Hello Hadoop Hive ", 3),
      ("Hello Hadoop ", 2),
      ("Hello", 1)
    )
    //todo 精简版
    //当函数给定什么值就返回什么值的场合，参数不能使用下划线代替，会出现错误
    println(tuples.map(s => (s._1.trim + " ") * s._2).flatMap(_.split(" ")).groupBy(_ + "").map(
      kv => (kv._1,kv._2.length)).toList.sortBy(-_._2)
      )
    //todo 完整版
    val tupleToMap: List[String] = tuples.map(s => (s._1.trim + " ") * s._2)
    val mapToList: List[String] = tupleToMap.flatMap(s => s.split(" "))
    val listToGroup: Map[String, List[String]] = mapToList.groupBy(s => s)
    val groupToTuple: Map[String, Int] = listToGroup.map(kv => (kv._1, kv._2.size))
    val tupleToSort: List[(String, Int)] = groupToTuple.toList.sortWith(
      (left, right) => {
        if(left._2 > right._2){
          true
        }else if(left._2 == right._2){
          left._1 < right._1
        }else{
          false
        }
      })
    println(tupleToSort.take(3))
  }
}
