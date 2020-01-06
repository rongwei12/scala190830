package com.atguigu.bigdata.scala.sz.chapter10

import org.apache.spark.{SparkConf, SparkContext}

object Scala01_WordCount {
  def main(args: Array[String]): Unit = {
    // 1. 创建 SparkConf对象, 并设置 App名字
    val conf: SparkConf = new SparkConf().setAppName("WordCount")
    // 2. 创建SparkContext对象
    val sc = new SparkContext(conf)
    // 3. 使用sc创建RDD并执行相应的transformation和action
    sc.textFile("E:\\2019_08_30\\input")
      .flatMap(_.split(" "))
      .map((_, 1))
      .reduceByKey(_ + _)
      .saveAsTextFile("E:\\2019_08_30\\result")
    // 4. 关闭连接
    sc.stop()

  }
}
