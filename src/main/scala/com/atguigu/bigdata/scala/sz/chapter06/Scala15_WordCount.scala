package com.atguigu.bigdata.scala.sz.chapter06

object Scala15_WordCount {
  def main(args: Array[String]): Unit = {
    //todo WordCount
    val list = List("Hello World", "Hello World", "Hello Scala", "Hello Scala Hadoop")
    //获取单词出现次数排名前3

    //todo 1.将原始的字符串拆分成一个一个的单词
    val wordList = list.flatMap(s=>s.split(" "))
    //todo 2.将相同的单词放置在一个组中
    val wordToList : Map[String, List[String]] = wordList.groupBy(_ + "")

    //todo 3.将分组后的数据进行结构的转换(word,list) => (word,list.size)
    val wordToCountMap = wordToList.map(
      kv => {
        (kv._1, kv._2.size)
      }
    )
    //todo 4.将转换结构后的数据进行排序(降序)，取前三名
    val tuples = wordToCountMap.toList.sortWith(
      (left, right) => {
        left._2 > right._2
      }
    ).take(3)

    println(tuples)
  }
//  val tuplesList = List(("Hello Scala World", 4), ("Hello World", 3), ("Hello Hadoop", 2), ("Hello Hbase", 1))

}
